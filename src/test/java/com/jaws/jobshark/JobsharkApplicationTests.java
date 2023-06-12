package com.jaws.jobshark;

import com.jaws.jobshark.models.ApplicationStage;
import com.jaws.jobshark.models.User;
import com.jaws.jobshark.models.Job;
import com.jaws.jobshark.repositories.JobRepository;
import com.jaws.jobshark.repositories.UserRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
		User jeremy = new User("jeremy@gmail.com", "Jezza", "Croydon", "music", "ghufoefh47t78gwy9rygewgdugf7r9qf4e");
		userRepository.save(jeremy);
	}

	@Test
	public void canSave() {
		sarah = new User("sarah@jobshark.com", "Sarah_1", "Edinburgh", "Technology", "9gbry78gsjgfgsjrs94324gfdsgft37403");
		userRepository.save(sarah);
		newJob = new Job(sarah, 1L, "Developer", "Reed", "Edinburgh", LocalDate.of(2014, Month.JANUARY, 1), "Fun", 28000, 35000, null, "www.reed.co.uk", null, false, true, "permanent", 7, ApplicationStage.APPLIED, false);
		jobRepository.save(newJob);
		sarah.addJob(newJob);
	}

}
