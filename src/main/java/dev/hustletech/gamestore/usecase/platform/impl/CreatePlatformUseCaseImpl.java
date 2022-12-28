package dev.hustletech.gamestore.usecase.platform.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.service.PlatformService;
import dev.hustletech.gamestore.usecase.platform.CreatePlatformUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CreatePlatformUseCaseImpl implements CreatePlatformUseCase {

    @Autowired
    PlatformService platformService;

    @Override
    public Platform execute(Platform platform) {

        return platformService.createPlatform(platform);
    }
    
}
