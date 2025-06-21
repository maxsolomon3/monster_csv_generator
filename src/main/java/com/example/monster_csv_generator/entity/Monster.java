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

}
