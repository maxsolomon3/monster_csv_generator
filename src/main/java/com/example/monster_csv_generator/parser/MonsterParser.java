package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MonsterParser
{
    private final ObjectMapper mapper;

    public MonsterParser()
    {
        this.mapper = new ObjectMapper();
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * Parses a single .monster JSON file into a ParsedMonsterDto.
     * @param file The .monster file to parse.
     * @return ParsedMonsterDto object.
     * @throws IOException if file read or parse fails.
     */
    public ParsedMonsterDto parseFromFile(File file) throws IOException
    {
        return mapper.readValue(file, ParsedMonsterDto.class);
    }

    public List<ParsedMonsterDto> parseAllFromFolder(Path folderPath) throws IOException
    {
        List<ParsedMonsterDto> monsterDtos = new ArrayList<>();
        if(!Files.isDirectory(folderPath))
        {
            throw new IllegalArgumentException(folderPath.toString() + " is not a valid folder path");
        }
        try
        {
            DirectoryStream<Path> stream = Files.newDirectoryStream(folderPath,"*.monster");
            for (Path filePath : stream) {
                try {
                    ParsedMonsterDto dto = parseFromFile(filePath.toFile());
                    monsterDtos.add(dto);
                } catch (Exception e) {
                    System.out.println("failed to parse file: " + filePath.getFileName() + " — " + e.getMessage());
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("failed to open folder: " + folderPath.toString() + " - " + e.getMessage());
        }
        return monsterDtos;
    }
}
