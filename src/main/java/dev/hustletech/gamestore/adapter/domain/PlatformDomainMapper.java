package dev.hustletech.gamestore.adapter.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.dto.request.PlatformRequestDTO;
import dev.hustletech.gamestore.entity.PlatformEntity;

@Mapper(componentModel = "spring")
public interface PlatformDomainMapper {

    @Mapping(target = "id", ignore = true)
    Platform convert(PlatformRequestDTO source);

    Platform convert(PlatformEntity response);

}
