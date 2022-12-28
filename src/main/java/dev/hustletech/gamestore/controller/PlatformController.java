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

import dev.hustletech.gamestore.adapter.domain.PlatformDomainMapper;
import dev.hustletech.gamestore.adapter.dto.PlatformDTOMapper;
import dev.hustletech.gamestore.domain.Platform;
import dev.hustletech.gamestore.dto.request.PlatformRequestDTO;
import dev.hustletech.gamestore.dto.response.PlatformResponseDTO;
import dev.hustletech.gamestore.usecase.platform.CreatePlatformUseCase;
import dev.hustletech.gamestore.usecase.platform.DeletePlatformUseCase;
import dev.hustletech.gamestore.usecase.platform.GetPlatformUseCase;
import dev.hustletech.gamestore.usecase.platform.UpdatePlatformUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(name = "platform", path = "/platforms", produces = "application/json")
@Tag(name = "Platforms", description = "Platforms Controller")
@AllArgsConstructor
public class PlatformController {

    @Autowired
    CreatePlatformUseCase createPlatformUseCase;

    @Autowired
    GetPlatformUseCase getPlatformUseCase;

    @Autowired
    UpdatePlatformUseCase updatePlatformUseCase;

    @Autowired
    DeletePlatformUseCase deletePlatformUseCase;

    PlatformDomainMapper platformDomainMapper;
    PlatformDTOMapper platformDTOMapper;

    @PostMapping
    public ResponseEntity<PlatformResponseDTO> create(@RequestBody PlatformRequestDTO platformRequestDTO) {

        // convert from RequestDTO to Domain
        Platform platformDomain = platformDomainMapper.convert(platformRequestDTO);
        // execute the UseCase
        Platform result = createPlatformUseCase.execute(platformDomain);
        // convert from Domain to ResponseDTO
        PlatformResponseDTO response = platformDTOMapper.convert(result);

        return ResponseEntity
                .status(201)
                .body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlatformResponseDTO> read(@PathVariable String id) {
        // execute the UseCase
        Platform result = getPlatformUseCase.execute(new ObjectId(id));
        // convert from Domain to ResponseDTO
        PlatformResponseDTO response = platformDTOMapper.convert(result);

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlatformResponseDTO> update(@PathVariable String id, @RequestBody PlatformRequestDTO platformRequestDTO) {
        // convert from RequestDTO to Domain
        Platform platformDomain = platformDomainMapper.convert(platformRequestDTO);
        // execute the UseCase
        Platform result = updatePlatformUseCase.execute(new ObjectId(id), platformDomain);
        // convert from Domain to ResponseDTO
        PlatformResponseDTO response = platformDTOMapper.convert(result);

        return ResponseEntity
                .status(202)
                .body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deletePlatformUseCase.execute(new ObjectId(id));
        return ResponseEntity
                .status(200)
                .build();
    }

}
