package dev.hustletech.gamestore.usecase.platform;

import org.bson.types.ObjectId;

public interface DeletePlatformUseCase {

    void execute(ObjectId id);
    
}
