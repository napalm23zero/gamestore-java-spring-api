package dev.hustletech.gamestore.usecase.game;

import dev.hustletech.gamestore.domain.Game;

public interface CreateGameUseCase {

    public Game execute(Game game);
    
}
