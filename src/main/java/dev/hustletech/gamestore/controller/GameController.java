package dev.hustletech.gamestore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hustletech.gamestore.mock.GameMock;
import dev.hustletech.gamestore.model.Game;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(name = "games", path = "/games", produces = "application/json")
@Tag(name = "Games", description = "Games Controller")
@RequiredArgsConstructor
public class GameController {

    @PostMapping
    public ResponseEntity<Game> create(@RequestBody Game game) {
        return ResponseEntity
                .status(201)
                .body(GameMock.buildOne());
    }

    @GetMapping
    public ResponseEntity<Game> read() {
        return ResponseEntity
                .status(200)
                .body(GameMock.buildOne());
    }

    @PutMapping
    public ResponseEntity<Game> update(@RequestBody Game game) {
        return ResponseEntity
                .status(200)
                .body(GameMock.buildOne());
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity
                .status(200).build();
    }

}
