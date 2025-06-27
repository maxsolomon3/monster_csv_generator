package com.example.monster_csv_generator.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String size;
    private String type;
    private String alignment;

    private Integer hitDice;

    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    private Integer speedWalk;
    private Integer speedFly;
    private Integer speedSwim;
    private Integer speedClimb;
    private Integer speedBurrow;

    private Integer blindsight;
    private Integer darkvision;

    private String cr;

    private Boolean isLegendary;
    private Boolean isMythic;

    @Lob
    private String legendariesDescription;

    @Lob
    private String lairDescription;

    // One Monster has many Abilities
    @OneToMany(mappedBy = "monster", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ability> abilities = new ArrayList<>();

    // One Monster has many Actions
    @OneToMany(mappedBy = "monster", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Action> actions = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Integer getHitDice() {
        return hitDice;
    }

    public void setHitDice(Integer hitDice) {
        this.hitDice = hitDice;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getSpeedWalk() {
        return speedWalk;
    }

    public void setSpeedWalk(Integer speedWalk) {
        this.speedWalk = speedWalk;
    }

    public Integer getSpeedFly() {
        return speedFly;
    }

    public void setSpeedFly(Integer speedFly) {
        this.speedFly = speedFly;
    }

    public Integer getSpeedSwim() {
        return speedSwim;
    }

    public void setSpeedSwim(Integer speedSwim) {
        this.speedSwim = speedSwim;
    }

    public Integer getSpeedClimb() {
        return speedClimb;
    }

    public void setSpeedClimb(Integer speedClimb) {
        this.speedClimb = speedClimb;
    }

    public Integer getSpeedBurrow() {
        return speedBurrow;
    }

    public void setSpeedBurrow(Integer speedBurrow) {
        this.speedBurrow = speedBurrow;
    }

    public Integer getBlindsight() {
        return blindsight;
    }

    public void setBlindsight(Integer blindsight) {
        this.blindsight = blindsight;
    }

    public Integer getDarkvision() {
        return darkvision;
    }

    public void setDarkvision(Integer darkvision) {
        this.darkvision = darkvision;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public Boolean getLegendary() {
        return isLegendary;
    }

    public void setLegendary(Boolean legendary) {
        isLegendary = legendary;
    }

    public Boolean getMythic() {
        return isMythic;
    }

    public void setMythic(Boolean mythic) {
        isMythic = mythic;
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

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
