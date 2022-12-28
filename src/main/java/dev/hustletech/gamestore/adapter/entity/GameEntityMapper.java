package dev.hustletech.gamestore.adapter.entity;

import org.mapstruct.Mapper;

import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.entity.GameEntity;

@Mapper(componentModel = "spring")
public interface GameEntityMapper {

    GameEntity convert(Game source);

}
