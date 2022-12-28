package dev.hustletech.gamestore.dto.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatformRequestDTO {

    private String name;
    private String manufacturer;
    private Date lauchDate;

}
