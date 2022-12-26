package dev.hustletech.gamestore.model;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {
    
    private UUID id;
    private String title;
    private BigDecimal price;
    private Platform platform;
    
}
