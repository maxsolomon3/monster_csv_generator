package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.entity.Monster;
import com.example.monster_csv_generator.repository.MonsterRepository;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

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

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath)))
        {
            String[] header = {"Name", "CR", "Type", "AbilityName", "AbilityDescription"};
            writer.writeNext(header);

            for(int i = 0; i < monsters.size(); i++)
            {
                if(monsters.get(i).getAbilities() != null && !monsters.get(i).getAbilities().isEmpty())
                {
                    for(int j = 0; j < monsters.get(i).getAbilities().size(); j++)
                    {
                        String[] line = {
                                monsters.get(i).getName(),
                                String.valueOf(monsters.get(i).getCr()),
                                monsters.get(i).getType(),
                                monsters.get(i).getName() != null ? monsters.get(i).getAbilities().get(j).getName() : "",
                                monsters.get(i).getAbilities().get(j).getDescription() != null ? monsters.get(i).getAbilities().get(j).getDescription() : ""
                        };
                        writer.writeNext(line);
                    }
                }
                else {
                    // Monster without abilities
                    String[] line = {
                            monsters.get(i).getName(),
                            String.valueOf(monsters.get(i).getCr()),
                            monsters.get(i).getType(),
                            "",
                            ""
                    };
                    writer.writeNext(line);
                }
            }

        }
        catch (IOException e)
        {
            System.out.println("Unable to write CSV at: " + filePath);
            throw new RuntimeException(e);
        }
    }
}
