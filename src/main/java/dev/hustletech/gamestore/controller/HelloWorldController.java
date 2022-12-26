package dev.hustletech.gamestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(name = "hello", path = "/hello", produces = "application/json")
@Tag(name = "HelloWorld", description = "HelloWorld Controller")
@RequiredArgsConstructor
public class HelloWorldController {

    @GetMapping(value = "/", produces = "text/plain")
    public String helloWorld() {
        return "Hello World";
    }

}
