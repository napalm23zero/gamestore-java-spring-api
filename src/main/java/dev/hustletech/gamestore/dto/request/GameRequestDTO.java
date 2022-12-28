package dev.hustletech.gamestore.dto.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameRequestDTO {

    private String name;
    private BigDecimal price;
    private PlatformRequestDTO platform;

}
