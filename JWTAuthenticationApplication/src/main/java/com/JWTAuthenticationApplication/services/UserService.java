package com.JWTAuthenticationApplication.services;

import com.JWTAuthenticationApplication.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> userList=new ArrayList<>();
    UserService(){
        userList.add(new User(UUID.randomUUID().toString(),"sm","sm@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"jk","jk@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"sh","sh@gmail.com"));
    }

    public List<User> getUser(){
        return this.userList;
    }
}
