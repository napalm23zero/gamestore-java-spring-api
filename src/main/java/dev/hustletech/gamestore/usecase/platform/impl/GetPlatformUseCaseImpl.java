package dev.hustletech.gamestore.usecase.platform.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.service.PlatformService;
import dev.hustletech.gamestore.usecase.platform.GetPlatformUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class GetPlatformUseCaseImpl implements GetPlatformUseCase {

    @Autowired
    PlatformService platformService;

    @Override
    public Platform execute(ObjectId id) {

        return platformService.getPlatform(id);
    }

}
