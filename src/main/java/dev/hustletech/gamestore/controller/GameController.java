package dev.hustletech.gamestore.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hustletech.gamestore.adapter.domain.GameDomainMapper;
import dev.hustletech.gamestore.adapter.dto.GameDTOMapper;
import dev.hustletech.gamestore.domain.Game;
import dev.hustletech.gamestore.dto.request.GameRequestDTO;
import dev.hustletech.gamestore.dto.response.GameResponseDTO;
import dev.hustletech.gamestore.usecase.game.CreateGameUseCase;
import dev.hustletech.gamestore.usecase.game.DeleteGameUseCase;
import dev.hustletech.gamestore.usecase.game.GetGameUseCase;
import dev.hustletech.gamestore.usecase.game.UpdateGameUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(name = "Game", path = "/Games", produces = "application/json")
@Tag(name = "Games", description = "Games Controller")
@AllArgsConstructor
public class GameController {

    @Autowired
    CreateGameUseCase createGameUseCase;

    @Autowired
    GetGameUseCase getGameUseCase;

    @Autowired
    UpdateGameUseCase updateGameUseCase;

    @Autowired
    DeleteGameUseCase deleteGameUseCase;

    GameDomainMapper GameDomainMapper;
    GameDTOMapper GameDTOMapper;

    @PostMapping
    public ResponseEntity<GameResponseDTO> create(@RequestBody GameRequestDTO GameRequestDTO) {

        // convert from RequestDTO to Domain
        Game GameDomain = GameDomainMapper.convert(GameRequestDTO);
        // execute the UseCase
        Game result = createGameUseCase.execute(GameDomain);
        // convert from Domain to ResponseDTO
        GameResponseDTO response = GameDTOMapper.convert(result);

        return ResponseEntity
                .status(201)
                .body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameResponseDTO> read(@PathVariable String id) {
        // execute the UseCase
        Game result = getGameUseCase.execute(new ObjectId(id));
        // convert from Domain to ResponseDTO
        GameResponseDTO response = GameDTOMapper.convert(result);

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GameResponseDTO> update(@PathVariable String id, @RequestBody GameRequestDTO GameRequestDTO) {
        // convert from RequestDTO to Domain
        Game GameDomain = GameDomainMapper.convert(GameRequestDTO);
        // execute the UseCase
        Game result = updateGameUseCase.execute(new ObjectId(id), GameDomain);
        // convert from Domain to ResponseDTO
        GameResponseDTO response = GameDTOMapper.convert(result);

        return ResponseEntity
                .status(202)
                .body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteGameUseCase.execute(new ObjectId(id));
        return ResponseEntity
                .status(200)
                .build();
    }

}
