package com.security32.practise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security32.practise.model.Users;
import com.security32.practise.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){
        return service.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.println("new User : "+user);
        
        return service.verify(user);
    }    
}
