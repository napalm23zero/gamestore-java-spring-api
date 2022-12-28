package dev.hustletech.gamestore.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "platform")
public class PlatformEntity {

    @Id
    private ObjectId id;
    private String name;
    private String manufacturer;
    private Date lauchDate;

}