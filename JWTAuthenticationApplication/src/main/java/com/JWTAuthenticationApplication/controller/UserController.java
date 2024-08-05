package com.JWTAuthenticationApplication.controller;

import com.JWTAuthenticationApplication.model.User;
import com.JWTAuthenticationApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUser();
    }
}
