package dev.hustletech.gamestore.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.hustletech.gamestore.adapter.domain.PlatformDomainMapper;
import dev.hustletech.gamestore.adapter.entity.PlatformEntityMapper;
import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.entity.PlatformEntity;
import dev.hustletech.gamestore.repository.PlatformRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlatformService {

    @Autowired
    PlatformRepository platformRepository;

    PlatformEntityMapper platformEntityMapper;
    PlatformDomainMapper platformDomainMapper;

    public Platform createPlatform(Platform platform) {
        PlatformEntity platformEntity = platformEntityMapper.convert(platform);
        PlatformEntity response = platformRepository.save(platformEntity);
        return platformDomainMapper.convert(response);
    }

    public Platform getPlatform(ObjectId id) {
        PlatformEntity response = platformRepository.findById(id);
        return platformDomainMapper.convert(response);
    }

    public Platform update(ObjectId id, Platform platform) {
        platform.setId(id);
        PlatformEntity platformEntity = platformEntityMapper.convert(platform);
        PlatformEntity response = platformRepository.save(platformEntity);
        return platformDomainMapper.convert(response);
    }

    public void delete(ObjectId id) {
        platformRepository.deleteById(id);
    }

}
