package dev.hustletech.gamestore.usecase.game.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hustletech.gamestore.service.GameService;
import dev.hustletech.gamestore.usecase.game.DeleteGameUseCase;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DeleteGameUseCaseImpl implements DeleteGameUseCase{

    @Autowired
    GameService gameService;

    @Override
    public void execute(ObjectId id) {
        gameService.delete(id);
        
    }
    
}
