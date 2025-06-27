package com.example.monster_csv_generator.repository;

import com.example.monster_csv_generator.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionRepository extends JpaRepository<Action,Long>
{
    // By action name
    List<Action> findByName(String name);
    List<Action> findByNameContainingIgnoreCase(String namePart);

    // By type (e.g., "action", "bonus", "legendary", "reaction")
    List<Action> findByType(String type);

    // By monster linkage
    List<Action> findByMonsterId(Long monsterId);
    List<Action> findByMonsterName(String monsterName);

    // Combined
    List<Action> findByMonsterNameAndType(String monsterName, String type);
    List<Action> findByMonsterIdAndType(Long monsterId, String type);

    // Search in description
    List<Action> findByDescriptionContainingIgnoreCase(String keyword);
}
