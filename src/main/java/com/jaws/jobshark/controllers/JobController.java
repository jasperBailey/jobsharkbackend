package com.jaws.jobshark.controllers;

import com.jaws.jobshark.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class JobController {
    @Autowired
    JobRepository jobRepository;
}
