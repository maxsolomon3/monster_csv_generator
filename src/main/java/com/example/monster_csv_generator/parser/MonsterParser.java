package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MonsterParser {
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
    public ParsedMonsterDto parseFromFile(File file) throws IOException {
        return mapper.readValue(file, ParsedMonsterDto.class);
    }
}
