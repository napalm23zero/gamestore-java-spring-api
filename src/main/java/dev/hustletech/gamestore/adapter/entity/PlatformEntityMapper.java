package dev.hustletech.gamestore.adapter.entity;

import org.mapstruct.Mapper;

import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.entity.PlatformEntity;

@Mapper(componentModel = "spring")
public interface PlatformEntityMapper {

    PlatformEntity convert(Platform source);

}
