package dev.hustletech.gamestore.usecase.platform;

import org.bson.types.ObjectId;

import dev.hustletech.gamestore.domain.Platform;

public interface UpdatePlatformUseCase {

    public Platform execute(ObjectId id, Platform platform);

}
