package ru.netology.springBootDemo.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @Value("${hello.from:undefined}")
    private String from;


    @GetMapping
    private String helloWorld(){
        return String.format("Hello from %s!",from);
    }
}
