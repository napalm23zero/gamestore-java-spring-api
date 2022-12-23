package dev.hustletech.gamestore.mock;

import java.math.BigDecimal;

import dev.hustletech.gamestore.model.Game;

public class GameMock {

    public static Game buildOne(){
        return Game.builder()
                    .title("God of War")
                    .price(new BigDecimal(312.89))
                    .platform(PlatformMock.buildOne())
                    .build();
    }
    
}
