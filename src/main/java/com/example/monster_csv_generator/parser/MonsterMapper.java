package com.example.monster_csv_generator.parser;

import com.example.monster_csv_generator.entity.Ability;
import com.example.monster_csv_generator.entity.Action;
import com.example.monster_csv_generator.entity.Monster;
import com.example.monster_csv_generator.monsterparser.dto.ParsedAbilityDto;
import com.example.monster_csv_generator.monsterparser.dto.ParsedActionDto;
import com.example.monster_csv_generator.monsterparser.dto.ParsedMonsterDto;

public class MonsterMapper {

    public static Monster toEntity(ParsedMonsterDto dto) {
        Monster monster = new Monster();

        monster.setName(dto.getName());
        monster.setCr(dto.getCr());
        monster.setType(dto.getType());

        monster.setAlignment(dto.getAlignment());
        monster.setBlindsight(dto.getBlindsight());
        monster.setCharisma(dto.getChaPoints());
        monster.setConstitution(dto.getConPoints());
        monster.setDarkvision(dto.getDarkvision());
        monster.setDexterity(dto.getDexPoints());
        monster.setHitDice(dto.getHitDice());
        monster.setIntelligence(dto.getIntPoints());
        monster.setLegendary(dto.isLegendary());
        monster.setMythic(dto.isMythic());
        monster.setLairDescription(dto.getLairDescription());
        monster.setLegendariesDescription(dto.getLegendariesDescription());
        monster.setSize(dto.getSize());
        monster.setSpeedBurrow(dto.getBurrowSpeed());
        monster.setSpeedClimb(dto.getClimbSpeed());
        monster.setSpeedFly(dto.getFlySpeed());
        monster.setSpeedSwim(dto.getSwimSpeed());
        monster.setSpeedWalk(dto.getSpeed());
        monster.setStrength(dto.getStrPoints());
        monster.setWisdom(dto.getWisPoints());


        // Abilities
        if (dto.getAbilities() != null) {
            for (ParsedAbilityDto abilityDto : dto.getAbilities()) {
                Ability ability = new Ability();
                ability.setName(abilityDto.name);
                ability.setDescription(abilityDto.desc);
                ability.setMonster(monster); // link back
                monster.getAbilities().add(ability);
            }
        }

        // Actions
        if (dto.getActions() != null) {
            for (ParsedActionDto actionDto : dto.getActions()) {
                Action action = new Action();
                action.setName(actionDto.name);
                action.setDescription(actionDto.desc);
                action.setMonster(monster); // link back
                monster.getActions().add(action);
            }
        }

        return monster;
    }
}
