package com.jaws.jobshark.controllers;

import com.jaws.jobshark.models.ApplicationStage;
import com.jaws.jobshark.models.Job;
import com.jaws.jobshark.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins="*")
public class JobController {
    @Autowired
    JobRepository jobRepository;

    private List<Job> innerJoin(List<Job> list1, List<Job> list2) {
        return list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/users/{sid}/jobs")
    public ResponseEntity<Optional<List<Job>>> getFilteredJobs(@PathVariable String sid,
                @RequestParam(name="stage", required = false) ApplicationStage stage){
        List<Job> jobList = jobRepository.findByUserSid(sid);
        List<Job> jobByStatus;

        if(stage != null){
            jobByStatus = jobRepository.findByApplicationStage(stage);
            jobList = innerJoin(jobList, jobByStatus);
        }
        return new ResponseEntity(jobList, HttpStatus.OK);
    }

    @PostMapping(value = "/jobs/add")
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
