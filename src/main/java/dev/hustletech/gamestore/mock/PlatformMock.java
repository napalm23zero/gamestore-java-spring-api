package dev.hustletech.gamestore.mock;

import dev.hustletech.gamestore.model.Platform;

public class PlatformMock {

    public static Platform buildOne(){
        return Platform.builder()
            .name("PlayStation")
        .build();
    }
    
}
