package com.jaws.jobshark.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value="/test")
    public ResponseEntity<Integer> getTest() {
        return new ResponseEntity<>(69, HttpStatus.OK);
    }
}
