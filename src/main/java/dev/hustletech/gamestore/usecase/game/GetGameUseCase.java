package dev.hustletech.gamestore.usecase.game;

import org.bson.types.ObjectId;

import dev.hustletech.gamestore.domain.Game;

public interface GetGameUseCase {

    Game execute(ObjectId id);
    
}
