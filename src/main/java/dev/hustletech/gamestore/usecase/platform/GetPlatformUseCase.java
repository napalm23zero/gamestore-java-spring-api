package dev.hustletech.gamestore.usecase.platform;

import org.bson.types.ObjectId;

import dev.hustletech.gamestore.domain.Platform;

public interface GetPlatformUseCase {

    Platform execute(ObjectId id);
    
}
