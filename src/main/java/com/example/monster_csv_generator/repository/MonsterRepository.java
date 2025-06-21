package com.example.monster_csv_generator.repository;

import com.example.monster_csv_generator.entity.Monster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MonsterRepository {
    List<Monster> findByName(String name);
    List<Monster> findByNameContainingIgnoreCase(String namePart);

    List<Monster> findBySize(String size);
    List<Monster> findByType(String type);
    List<Monster> findByTypeContainingIgnoreCase(String typePart);
    List<Monster> findByAlignment(String alignment);
    List<Monster> findByAlignmentContainingIgnoreCase(String alignmentPart);

    List<Monster> findByCr(String cr);

    List<Monster> findByIsLegendaryTrue();
    List<Monster> findByIsLegendaryFalse();
    List<Monster> findByIsMythicTrue();
    List<Monster> findByIsMythicFalse();

    List<Monster> findByStrengthGreaterThanEqual(Integer strength);
    List<Monster> findByDexterityGreaterThanEqual(Integer dexterity);
    List<Monster> findByConstitutionGreaterThanEqual(Integer constitution);
    List<Monster> findByIntelligenceGreaterThanEqual(Integer intelligence);
    List<Monster> findByWisdomGreaterThanEqual(Integer wisdom);
    List<Monster> findByCharismaGreaterThanEqual(Integer charisma);

    List<Monster> findBySpeedFlyGreaterThan(Integer speedFly);
    List<Monster> findBySpeedSwimGreaterThan(Integer speedSwim);
    List<Monster> findByDarkvisionGreaterThan(Integer darkvision);
    List<Monster> findByBlindsightGreaterThan(Integer blindsight);

    @Query("SELECT m FROM Monster m JOIN m.abilities a WHERE a.name = :abilityName")
    List<Monster> findByAbilityName(@Param("abilityName") String abilityName);

    @Query("SELECT m FROM Monster m WHERE CAST(m.cr AS integer) >= :minCr")
    List<Monster> findByCrGreaterThanEqual(@Param("minCr") int minCr);

}
