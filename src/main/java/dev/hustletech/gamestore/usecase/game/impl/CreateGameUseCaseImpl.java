package dev.hustletech.gamestore.usecase.game.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.service.GameService;
import dev.hustletech.gamestore.usecase.game.CreateGameUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CreateGameUseCaseImpl implements CreateGameUseCase {

    @Autowired
    GameService gameService;

    @Override
    public Game execute(Game game) {

        return gameService.createGame(game);
    }
    
}
