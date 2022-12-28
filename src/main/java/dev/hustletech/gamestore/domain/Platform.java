package dev.hustletech.gamestore.domain;

import java.util.Date;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Platform {

    private ObjectId id;
    private String name;
    private String manufacturer;
    private Date lauchDate;
}