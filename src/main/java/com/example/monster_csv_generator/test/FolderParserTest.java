package com.example.monster_csv_generator.test;

import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;
import com.example.monster_csv_generator.parser.MonsterParser;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class FolderParserTest {
    public static void main(String args[]) throws IOException {
        MonsterParser parser = new MonsterParser();
        Path folderPath = Path.of("C:\\Users\\maxso\\IdeaProjects\\monster_csv_generator\\src\\main\\java\\com\\example\\monster_csv_generator\\test\\resources");
        List<ParsedMonsterDto> monsterList = parser.parseAllFromFolder(folderPath);
        for(int i = 0; i < monsterList.size(); i++)
        {
            System.out.println("Monster Name: " + monsterList.get(i).name);
            System.out.println("CR: " + monsterList.get(i).cr);
            System.out.println("Abilities: ");
            monsterList.get(i).abilities.forEach(ability -> System.out.println(" - " + ability.name));
            System.out.println("Actions: ");
            monsterList.get(i).actions.forEach(ability -> System.out.println(" - " + ability.name));
            System.out.println("Strength: ");
            System.out.println(" - " + monsterList.get(i).strPoints);
        }
    }
}
