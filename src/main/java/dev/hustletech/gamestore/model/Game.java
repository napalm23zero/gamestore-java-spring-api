package dev.hustletech.gamestore.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {

    private String title;
    private BigDecimal price;
    private Platform platform;
    
}
