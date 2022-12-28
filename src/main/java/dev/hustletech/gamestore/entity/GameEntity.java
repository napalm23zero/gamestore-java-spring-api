package dev.hustletech.gamestore.entity;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "game")
public class GameEntity {

    @Id
    private ObjectId id;
    private String name;
    private BigDecimal price;
    private PlatformEntity platform;

}
