package com.jaws.jobshark.controllers;

import com.jaws.jobshark.models.User;
import com.jaws.jobshark.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> showAll(){
        return userRepository.findAll();
    }
}
