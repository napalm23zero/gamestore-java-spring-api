package dev.hustletech.gamestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello", produces = "text/plain")
    public String helloWorld(){
        return "Hello World";
    }

}
