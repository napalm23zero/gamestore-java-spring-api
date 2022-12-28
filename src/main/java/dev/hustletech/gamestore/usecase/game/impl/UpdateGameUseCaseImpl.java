package dev.hustletech.gamestore.usecase.game.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.service.GameService;
import dev.hustletech.gamestore.usecase.game.UpdateGameUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UpdateGameUseCaseImpl implements UpdateGameUseCase {

    @Autowired
    GameService gameService;

    @Override
    public Game execute(ObjectId id, Game game) {
        return gameService.update(id, game);
    }

}
