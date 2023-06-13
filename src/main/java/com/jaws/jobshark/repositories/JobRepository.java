package com.jaws.jobshark.repositories;

import com.jaws.jobshark.models.ApplicationStage;
import com.jaws.jobshark.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long>{
    List<Job> findByUserSid(String sid);
    List<Job> findByApplicationStage(ApplicationStage status);

}
