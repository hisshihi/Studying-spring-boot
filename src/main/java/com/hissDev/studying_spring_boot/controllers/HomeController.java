package com.hissDev.studying_spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String sayHello() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("about")
    public String about() {
        return "This is about Spring Boot!";
    }

}
