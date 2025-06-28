package com.example.monster_csv_generator.monsterparser.dto;

import java.util.List;

public class ParsedMonsterDto
{
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getCustomCr() {
        return customCr;
    }

    public void setCustomCr(String customCr) {
        this.customCr = customCr;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public boolean isMythic() {
        return isMythic;
    }

    public void setMythic(boolean mythic) {
        isMythic = mythic;
    }

    public boolean isLair() {
        return isLair;
    }

    public void setLair(boolean lair) {
        isLair = lair;
    }

    public boolean isRegional() {
        return isRegional;
    }

    public void setRegional(boolean regional) {
        isRegional = regional;
    }

    public int getStrPoints() {
        return strPoints;
    }

    public void setStrPoints(int strPoints) {
        this.strPoints = strPoints;
    }

    public int getDexPoints() {
        return dexPoints;
    }

    public void setDexPoints(int dexPoints) {
        this.dexPoints = dexPoints;
    }

    public int getConPoints() {
        return conPoints;
    }

    public void setConPoints(int conPoints) {
        this.conPoints = conPoints;
    }

    public int getIntPoints() {
        return intPoints;
    }

    public void setIntPoints(int intPoints) {
        this.intPoints = intPoints;
    }

    public int getWisPoints() {
        return wisPoints;
    }

    public void setWisPoints(int wisPoints) {
        this.wisPoints = wisPoints;
    }

    public int getChaPoints() {
        return chaPoints;
    }

    public void setChaPoints(int chaPoints) {
        this.chaPoints = chaPoints;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public String getHpText() {
        return hpText;
    }

    public void setHpText(String hpText) {
        this.hpText = hpText;
    }

    public boolean isCustomHP() {
        return customHP;
    }

    public void setCustomHP(boolean customHP) {
        this.customHP = customHP;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getNatArmorBonus() {
        return natArmorBonus;
    }

    public void setNatArmorBonus(int natArmorBonus) {
        this.natArmorBonus = natArmorBonus;
    }

    public int getShieldBonus() {
        return shieldBonus;
    }

    public void setShieldBonus(int shieldBonus) {
        this.shieldBonus = shieldBonus;
    }

    public String getOtherArmorDesc() {
        return otherArmorDesc;
    }

    public void setOtherArmorDesc(String otherArmorDesc) {
        this.otherArmorDesc = otherArmorDesc;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public int getClimbSpeed() {
        return climbSpeed;
    }

    public void setClimbSpeed(int climbSpeed) {
        this.climbSpeed = climbSpeed;
    }

    public int getBurrowSpeed() {
        return burrowSpeed;
    }

    public void setBurrowSpeed(int burrowSpeed) {
        this.burrowSpeed = burrowSpeed;
    }

    public boolean isHover() {
        return hover;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public boolean isCustomSpeed() {
        return customSpeed;
    }

    public void setCustomSpeed(boolean customSpeed) {
        this.customSpeed = customSpeed;
    }

    public String getSpeedDesc() {
        return speedDesc;
    }

    public void setSpeedDesc(String speedDesc) {
        this.speedDesc = speedDesc;
    }

    public int getBlindsight() {
        return blindsight;
    }

    public void setBlindsight(int blindsight) {
        this.blindsight = blindsight;
    }

    public int getDarkvision() {
        return darkvision;
    }

    public void setDarkvision(int darkvision) {
        this.darkvision = darkvision;
    }

    public int getTremorsense() {
        return tremorsense;
    }

    public void setTremorsense(int tremorsense) {
        this.tremorsense = tremorsense;
    }

    public int getTruesight() {
        return truesight;
    }

    public void setTruesight(int truesight) {
        this.truesight = truesight;
    }

    public int getTelepathy() {
        return telepathy;
    }

    public void setTelepathy(int telepathy) {
        this.telepathy = telepathy;
    }

    public boolean isBlind() {
        return blind;
    }

    public void setBlind(boolean blind) {
        this.blind = blind;
    }

    public List<ParsedAbilityDto> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<ParsedAbilityDto> abilities) {
        this.abilities = abilities;
    }

    public List<ParsedActionDto> getActions() {
        return actions;
    }

    public void setActions(List<ParsedActionDto> actions) {
        this.actions = actions;
    }

    public List<ParsedActionDto> getBonusActions() {
        return bonusActions;
    }

    public void setBonusActions(List<ParsedActionDto> bonusActions) {
        this.bonusActions = bonusActions;
    }

    public List<ParsedActionDto> getReactions() {
        return reactions;
    }

    public void setReactions(List<ParsedActionDto> reactions) {
        this.reactions = reactions;
    }

    public List<ParsedActionDto> getLegendaries() {
        return legendaries;
    }

    public void setLegendaries(List<ParsedActionDto> legendaries) {
        this.legendaries = legendaries;
    }

    public List<ParsedActionDto> getMythics() {
        return mythics;
    }

    public void setMythics(List<ParsedActionDto> mythics) {
        this.mythics = mythics;
    }

    public List<ParsedSavingThrowDto> getSthrows() {
        return sthrows;
    }

    public void setSthrows(List<ParsedSavingThrowDto> sthrows) {
        this.sthrows = sthrows;
    }

    public List<ParsedSkillDto> getSkills() {
        return skills;
    }

    public void setSkills(List<ParsedSkillDto> skills) {
        this.skills = skills;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    public List<ParsedDamageDto> getDamagetypes() {
        return damagetypes;
    }

    public void setDamagetypes(List<ParsedDamageDto> damagetypes) {
        this.damagetypes = damagetypes;
    }

    public List<ParsedDamageDto> getSpecialdamage() {
        return specialdamage;
    }

    public void setSpecialdamage(List<ParsedDamageDto> specialdamage) {
        this.specialdamage = specialdamage;
    }

    public List<ParsedLanguageDto> getLanguages() {
        return languages;
    }

    public void setLanguages(List<ParsedLanguageDto> languages) {
        this.languages = languages;
    }

    public String getUnderstandsBut() {
        return understandsBut;
    }

    public void setUnderstandsBut(String understandsBut) {
        this.understandsBut = understandsBut;
    }

    public String getLegendariesDescription() {
        return legendariesDescription;
    }

    public void setLegendariesDescription(String legendariesDescription) {
        this.legendariesDescription = legendariesDescription;
    }

    public String getLairDescription() {
        return lairDescription;
    }

    public void setLairDescription(String lairDescription) {
        this.lairDescription = lairDescription;
    }

    public String getLairDescriptionEnd() {
        return lairDescriptionEnd;
    }

    public void setLairDescriptionEnd(String lairDescriptionEnd) {
        this.lairDescriptionEnd = lairDescriptionEnd;
    }

    public String getMythicDescription() {
        return mythicDescription;
    }

    public void setMythicDescription(String mythicDescription) {
        this.mythicDescription = mythicDescription;
    }

    public String getRegionalDescription() {
        return regionalDescription;
    }

    public void setRegionalDescription(String regionalDescription) {
        this.regionalDescription = regionalDescription;
    }

    public String getRegionalDescriptionEnd() {
        return regionalDescriptionEnd;
    }

    public void setRegionalDescriptionEnd(String regionalDescriptionEnd) {
        this.regionalDescriptionEnd = regionalDescriptionEnd;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPluralName() {
        return pluralName;
    }

    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    public boolean isDoubleColumns() {
        return doubleColumns;
    }

    public void setDoubleColumns(boolean doubleColumns) {
        this.doubleColumns = doubleColumns;
    }

    public int getSeparationPoint() {
        return separationPoint;
    }

    public void setSeparationPoint(int separationPoint) {
        this.separationPoint = separationPoint;
    }
}
