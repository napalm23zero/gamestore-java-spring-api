package dev.hustletech.gamestore.adapter.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.dto.request.GameRequestDTO;
import dev.hustletech.gamestore.entity.GameEntity;

@Mapper(componentModel = "spring", uses = PlatformDomainMapper.class)
public interface GameDomainMapper {

    @Mapping(target = "id", ignore = true)
    Game convert(GameRequestDTO source);

    Game convert(GameEntity response);

}
