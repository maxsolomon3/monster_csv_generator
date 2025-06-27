package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.entity.Monster;
import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;

public class MonsterMapper {

    public static Monster toEntity(ParsedMonsterDto dto) {
        Monster monster = new Monster();
        monster.setName(dto.name);
        monster.setType(dto.type);
        monster.setCr(dto.cr);
        monster.setAlignment(dto.alignment);
        return monster;
    }
}
