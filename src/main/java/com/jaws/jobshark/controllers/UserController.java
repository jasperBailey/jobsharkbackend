package com.jaws.jobshark.controllers;

import com.jaws.jobshark.models.User;
import com.jaws.jobshark.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> showAll(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{sub}")
    public ResponseEntity<Optional<User>> findBySub(@PathVariable String sub){
        return new ResponseEntity<>(userRepository.findBySub(sub), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user){
        Optional<User> foundUser = userRepository.findBySub(user.getSub());
        if ( foundUser.isEmpty() ) {
            userRepository.save(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(foundUser.get(), HttpStatus.I_AM_A_TEAPOT);
        }


    }

    @DeleteMapping(value = "/users/delete")
    public ResponseEntity<String> deleteAll(){
        userRepository.deleteAll();
        return new ResponseEntity<>("Heck yeah we deleted all our user data ^_^", HttpStatus.NO_CONTENT);
    }



}
