package com.jaws.jobshark.repositories;

import com.jaws.jobshark.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long>{
    public List<Job> findByUserSid(String sid);
}
