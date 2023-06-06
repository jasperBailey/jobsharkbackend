package com.jaws.jobshark;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;

@SpringBootTest
class JobsharkApplicationTests {

	@Autowired
			JobRepository jobRepository;

	@Autowired
			UserRepository userRepository;


	Job newJob;
	User sarah;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSave() {
		sarah = new User("sarah@jobshark.com", "Sarah_1", "Edinburgh", "Technology");
		userRepository.save(sarah);
		newJob = new Job(1, sarah, "Developer", "Reed", "Edinburgh", LocalDate.of(2014, Month.JANUARY, 1), "Fun", 28000, 35000, null, "www.reed.co.uk", null, false, true, "permanent", 7);
		jobRepository.save(newJob);
	}

}
