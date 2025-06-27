package com.example.monster_csv_generator.entity;

import jakarta.persistence.*;

@Entity
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monster_id")
    private Monster monster;
}
