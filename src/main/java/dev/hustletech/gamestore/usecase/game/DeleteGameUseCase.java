package dev.hustletech.gamestore.usecase.game;

import org.bson.types.ObjectId;

public interface DeleteGameUseCase {

    void execute(ObjectId id);
    
}
