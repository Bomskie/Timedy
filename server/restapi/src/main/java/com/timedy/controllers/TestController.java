package com.timedy.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/cool-cars")
    public String coolCars() {
        return "CoolCars";
    }
}

