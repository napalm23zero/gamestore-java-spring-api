package dev.hustletech.gamestore.usecase.game.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.service.GameService;
import dev.hustletech.gamestore.usecase.game.GetGameUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class GetGameUseCaseImpl implements GetGameUseCase {

    @Autowired
    GameService gameService;

    @Override
    public Game execute(ObjectId id) {

        return gameService.getGame(id);
    }

}
