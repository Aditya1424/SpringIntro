package com.example.demoApp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @PutMapping("/put/{firstName}")
    public String getMessage(@PathVariable String firstName, @RequestParam(value="lastName") String lastName){

        return "Hello"+ firstName+" "+ lastName+ "!";
    }
}

