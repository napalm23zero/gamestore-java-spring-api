package dev.hustletech.gamestore.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Platform {

    private UUID id;
    private String name;

}