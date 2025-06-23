package com.example.monster_csv_generator.monsterparser.dto;

import java.util.List;

public class ParsedMonsterDto {
    // Basic info
    public String name;
    public String size;
    public String type;
    public String tag;
    public String alignment;
    public String cr;
    public String customCr;

    // Combat metadata
    public boolean isLegendary;
    public boolean isMythic;
    public boolean isLair;
    public boolean isRegional;

    // Stats
    public int strPoints;
    public int dexPoints;
    public int conPoints;
    public int intPoints;
    public int wisPoints;
    public int chaPoints;

    // HP & armor
    public int hitDice;
    public String hpText;
    public boolean customHP;

    public String armorName;
    public int natArmorBonus;
    public int shieldBonus;
    public String otherArmorDesc;

    // Speed
    public int speed;
    public int swimSpeed;
    public int flySpeed;
    public int climbSpeed;
    public int burrowSpeed;
    public boolean hover;
    public boolean customSpeed;
    public String speedDesc;

    // Senses
    public int blindsight;
    public int darkvision;
    public int tremorsense;
    public int truesight;
    public int telepathy;
    public boolean blind;

    // Abilities & actions
    public List<ParsedAbilityDto> abilities;
    public List<ParsedActionDto> actions;
    public List<ParsedActionDto> bonusActions;
    public List<ParsedActionDto> reactions;
    public List<ParsedActionDto> legendaries;
    public List<ParsedActionDto> mythics;

    // Skills, saving throws, conditions
    public List<ParsedSavingThrowDto> sthrows;
    public List<ParsedSkillDto> skills;
    public List<String> conditions;

    // Damage types
    public List<ParsedDamageDto> damagetypes;
    public List<ParsedDamageDto> specialdamage;

    // Languages
    public List<ParsedLanguageDto> languages;
    public String understandsBut;

    // Other optional fields
    public String legendariesDescription;
    public String lairDescription;
    public String lairDescriptionEnd;
    public String mythicDescription;
    public String regionalDescription;
    public String regionalDescriptionEnd;

    // GUI / formatting (used by generator)
    public String shortName;
    public String pluralName;
    public boolean doubleColumns;
    public int separationPoint;
}
