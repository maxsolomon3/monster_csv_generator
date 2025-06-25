package com.example.monster_csv_generator.test;

import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;
import com.example.monster_csv_generator.parser.MonsterParser;

import java.io.File;
import java.io.IOException;

public class ParserTest {
    public static void main(String[] args) throws IOException {
        MonsterParser parser = new MonsterParser();
        File file = new File("C:\\Users\\maxso\\IdeaProjects\\monster_csv_generator\\src\\main\\java\\com\\example\\monster_csv_generator\\test\\adult_black_dragon.monster");
        ParsedMonsterDto dto = parser.parseFromFile(file);
        System.out.println("Monster Name: " + dto.name);
        System.out.println("CR: " + dto.cr);
        System.out.println("Abilities: ");
        dto.abilities.forEach(ability -> System.out.println(" - " + ability.name));
        System.out.println("Actions: ");
        dto.actions.forEach(ability -> System.out.println(" - " + ability.name));
        System.out.println("Strength: ");
        System.out.println(" - " + dto.strPoints);
    }
}
