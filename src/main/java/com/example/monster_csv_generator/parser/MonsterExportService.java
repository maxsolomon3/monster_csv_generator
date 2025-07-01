package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.entity.Ability;
import com.example.monster_csv_generator.entity.Action;
import com.example.monster_csv_generator.entity.Monster;
import com.example.monster_csv_generator.repository.MonsterRepository;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonsterExportService {
    public final MonsterRepository monsterRepository;

    public MonsterExportService(MonsterRepository monsterRepository)
    {
        this.monsterRepository = monsterRepository;
    }

    public void exportToCSV(String filePath)
    {
        List<Monster> monsters = monsterRepository.findAll();

        // Step 1: Find max counts
        int maxAbilities = monsters.stream()
                .mapToInt(m -> m.getAbilities().size())
                .max()
                .orElse(0);
        int maxActions = monsters.stream()
                .mapToInt(m -> m.getActions().size())
                .max()
                .orElse(0);

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Step 2: Build header
            List<String> header = new ArrayList<>();
            // Add fixed monster fields first
            header.add("Name");
            header.add("CR");
            header.add("Type");
            // Add ability columns
            for (int i = 1; i <= maxAbilities; i++) {
                header.add("Ability" + i + " Name");
                header.add("Ability" + i + " Description");
            }
            // Add action columns
            for (int i = 1; i <= maxActions; i++) {
                header.add("Action" + i + " Name");
                header.add("Action" + i + " Description");
            }
            writer.writeNext(header.toArray(new String[0]));

            // Step 3: Write each monster's data
            for (Monster monster : monsters) {
                List<String> row = new ArrayList<>();
                row.add(monster.getName());
                row.add(String.valueOf(monster.getCr()));
                row.add(monster.getType());

                // Fill ability columns
                List<Ability> abilities = monster.getAbilities();
                for (int i = 0; i < maxAbilities; i++) {
                    if (i < abilities.size()) {
                        row.add(abilities.get(i).getName());
                        row.add(abilities.get(i).getDescription());
                    } else {
                        row.add(""); // Empty name
                        row.add(""); // Empty description
                    }
                }

                // Fill action columns
                List<Action> actions = monster.getActions();
                for (int i = 0; i < maxActions; i++) {
                    if (i < actions.size()) {
                        row.add(actions.get(i).getName());
                        row.add(actions.get(i).getDescription());
                    } else {
                        row.add("");
                        row.add("");
                    }
                }

                writer.writeNext(row.toArray(new String[0]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
