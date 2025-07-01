package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.entity.Monster;
import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;
import com.example.monster_csv_generator.parser.MonsterParser;
import com.example.monster_csv_generator.repository.MonsterRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@Service
public class MonsterImportService {

    private final MonsterParser monsterParser;
    private final MonsterRepository monsterRepository;

    public MonsterImportService(MonsterParser monsterParser, MonsterRepository monsterRepository) {
        this.monsterParser = monsterParser;
        this.monsterRepository = monsterRepository;
    }

    public void importFromFolder(Path folderPath) throws IOException {
        List<ParsedMonsterDto> parsedMonsters = monsterParser.parseAllFromFolder(folderPath);

        for (ParsedMonsterDto dto : parsedMonsters) {
            Monster entity = MonsterMapper.toEntity(dto);
            if (monsterRepository.existsByNameIgnoreCase(dto.getName()))
            {
                System.out.println("Skipping duplicate monster: " + entity.getName());
                continue;
            }
            monsterRepository.save(entity);
        }
    }
}
