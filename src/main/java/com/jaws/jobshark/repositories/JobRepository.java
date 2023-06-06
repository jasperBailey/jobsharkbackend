package com.jaws.jobshark.repositories;

import com.jaws.jobshark.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long>{
}
