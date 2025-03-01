package com.example.demoApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/param/{name}")
    public String getMessage(@PathVariable String name){

        return "Hello"+ name+ "!";
    }
}

