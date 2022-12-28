package dev.hustletech.gamestore.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.hustletech.gamestore.adapter.domain.GameDomainMapper;
import dev.hustletech.gamestore.adapter.entity.GameEntityMapper;
import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.entity.GameEntity;
import dev.hustletech.gamestore.repository.GameRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GameService {

    @Autowired
    GameRepository gameRepository;

    GameEntityMapper gameEntityMapper;
    GameDomainMapper gameDomainMapper;

    public Game createGame(Game game) {
        GameEntity gameEntity = gameEntityMapper.convert(game);
        GameEntity response = gameRepository.save(gameEntity);
        return gameDomainMapper.convert(response);
    }

    public Game getGame(ObjectId id) {
        GameEntity response = gameRepository.findById(id);
        return gameDomainMapper.convert(response);
    }

    public Game update(ObjectId id, Game game) {
        game.setId(id);
        GameEntity gameEntity = gameEntityMapper.convert(game);
        GameEntity response = gameRepository.save(gameEntity);
        return gameDomainMapper.convert(response);
    }

    public void delete(ObjectId id) {
        gameRepository.deleteById(id);
    }

}
