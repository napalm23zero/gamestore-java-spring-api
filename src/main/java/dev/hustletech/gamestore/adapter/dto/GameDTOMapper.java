package dev.hustletech.gamestore.adapter.dto;

import org.mapstruct.Mapper;

import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.dto.response.GameResponseDTO;

@Mapper(componentModel = "spring")
public interface GameDTOMapper {

    GameResponseDTO convert(Game result);

}
