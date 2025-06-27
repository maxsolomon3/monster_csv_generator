package com.example.monster_csv_generator.repository;

import com.example.monster_csv_generator.entity.Ability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbilityRepository extends JpaRepository<Ability,Long>
{
    // Name-based queries
    List<Ability> findByName(String name);
    List<Ability> findByNameIgnoreCase(String name);
    List<Ability> findByNameContainingIgnoreCase(String namePart);

    // Monster-based queries
    List<Ability> findByMonsterId(Long monsterId);
    List<Ability> findByMonsterName(String monsterName);

    // Combined filters
    List<Ability> findByMonsterNameAndNameContainingIgnoreCase(String monsterName, String namePart);

    // Description text search
    List<Ability> findByDescriptionContainingIgnoreCase(String keyword);
}
