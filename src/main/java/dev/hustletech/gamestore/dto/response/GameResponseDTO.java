package dev.hustletech.gamestore.dto.response;

import java.math.BigDecimal;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameResponseDTO {

    private ObjectId id;
    private String name;
    private BigDecimal price;
    private PlatformResponseDTO platform;

}
