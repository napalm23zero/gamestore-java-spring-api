package dev.hustletech.gamestore.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import dev.hustletech.gamestore.entity.PlatformEntity;

public interface PlatformRepository
                extends MongoRepository<PlatformEntity, Integer> {

        @Query("{'id' : ?0}")
        PlatformEntity findById(ObjectId id);

        @DeleteQuery("{'id' : ?0}")
        void deleteById(ObjectId id);

}
