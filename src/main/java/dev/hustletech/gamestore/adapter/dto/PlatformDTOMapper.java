package dev.hustletech.gamestore.adapter.dto;

import org.mapstruct.Mapper;

import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.dto.response.PlatformResponseDTO;

@Mapper(componentModel = "spring")
public interface PlatformDTOMapper {

    PlatformResponseDTO convert(Platform source);

}
