package com.jaws.jobshark.controllers;

import com.jaws.jobshark.models.Job;
import com.jaws.jobshark.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobRepository jobRepository;

    @GetMapping(value = "/jobs")
    public List<Job> showAll(){
        return jobRepository.findAll();
    }

    
}
