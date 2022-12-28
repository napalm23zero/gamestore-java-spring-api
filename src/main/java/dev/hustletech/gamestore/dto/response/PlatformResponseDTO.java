package dev.hustletech.gamestore.dto.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatformResponseDTO {

    private String name;
    private String manufacturer;
    private Date lauchDate;

}
