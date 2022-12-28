package dev.hustletech.gamestore.domain;

import java.math.BigDecimal;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    private ObjectId id;
    private String name;
    private BigDecimal price;
    private Platform platform;

}
