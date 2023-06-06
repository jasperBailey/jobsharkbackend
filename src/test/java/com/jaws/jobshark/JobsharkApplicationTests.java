package com.jaws.jobshark;

import com.jaws.jobshark.models.User;
import com.jaws.jobshark.repositories.UserRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;

@SpringBootTest
public class JobsharkApplicationTests {

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

	public void createUser() {
		User jeremy = new User("jeremy@gmail.com", "Jezza", "Croydon", "music");
		userRepository.save(jeremy);

	public void canSave() {
		sarah = new User("sarah@jobshark.com", "Sarah_1", "Edinburgh", "Technology");
		userRepository.save(sarah);
		newJob = new Job(sarah, 1, "Developer", "Reed", "Edinburgh", LocalDate.of(2014, Month.JANUARY, 1), "Fun", 28000, 35000, null, "www.reed.co.uk", null, false, true, "permanent", 7);
		jobRepository.save(newJob);

	}

}
