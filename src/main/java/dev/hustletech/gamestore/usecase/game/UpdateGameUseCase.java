package dev.hustletech.gamestore.usecase.game;

import org.bson.types.ObjectId;

import dev.hustletech.gamestore.domain.Game;

public interface UpdateGameUseCase {

    public Game execute(ObjectId id, Game game);

}
