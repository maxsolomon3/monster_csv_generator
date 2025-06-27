package com.example.monster_csv_generator;

import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;
import com.example.monster_csv_generator.parser.MonsterParser;
import com.example.monster_csv_generator.parser.MonsterParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MonsterParserTest {

	private MonsterParser monsterParser;

	@BeforeEach
	void setUp() {
		monsterParser = new MonsterParser();
	}

	@Test
	void testParseAllFromFolder_validAndInvalidFiles() throws IOException {
		// Given: A test folder with .monster files
		Path folderPath = Path.of("C:\\Users\\maxso\\IdeaProjects\\monster_csv_generator\\src\\test\\java\\com\\example\\monster_csv_generator\\resources");

		// When: Parsing the folder
		List<ParsedMonsterDto> monsters = monsterParser.parseAllFromFolder(folderPath);

		// Then: Valid monster files are parsed successfully
		assertNotNull(monsters);
		assertFalse(monsters.isEmpty(), "Should parse at least one valid monster");

		// Check for a known monster name in your valid file
		boolean containsBlackDragon = monsters.stream()
				.anyMatch(m -> "Adult Black Dragon".equalsIgnoreCase(m.name));

		assertTrue(containsBlackDragon, "Parsed monsters should include Adult Black Dragon");

		// Optional: assert that corrupted files didn’t cause a crash
		assertTrue(monsters.size() < 3, "Should skip invalid files if present");
	}
}