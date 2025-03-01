package com.example.demoApp.controller;
import com.example.demoApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @PostMapping("/post")
    public String getMessage(@RequestBody User user){

        return "Hello"+ user.getFirstName()+" "+ user.getLastName();
    }
}

