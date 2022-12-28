package dev.hustletech.gamestore.usecase.platform.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.service.PlatformService;
import dev.hustletech.gamestore.usecase.platform.DeletePlatformUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DeletePlatformUseCaseImpl implements DeletePlatformUseCase{

    @Autowired
    PlatformService platformService;

    @Override
    public void execute(ObjectId id) {
        platformService.delete(id);
        
    }
    
}
