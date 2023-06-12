package com.jaws.jobshark.controllers;

import com.jaws.jobshark.models.Job;
import com.jaws.jobshark.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
public class JobController {
    @Autowired
    JobRepository jobRepository;

    @GetMapping(value = "/jobs")
    public ResponseEntity<List<Job>> showAll(){
        return new ResponseEntity(jobRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/jobs/{sid}")
    public ResponseEntity<Optional<List<Job>>> findById(@PathVariable String sid){
        return new ResponseEntity(jobRepository.findByUserSid(sid), HttpStatus.OK);
    }

    @PostMapping(value = "/jobs")
    public ResponseEntity<Job> postJob(@RequestBody Job job){
        jobRepository.save(job);
        return new ResponseEntity(job, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/jobs/delete/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id){
        jobRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/jobs/delete")
    public ResponseEntity<String> deleteAll(){
        jobRepository.deleteAll();
        return new ResponseEntity("Heck yeah we deleted all our job data ^_^", HttpStatus.NO_CONTENT);
    }

}
