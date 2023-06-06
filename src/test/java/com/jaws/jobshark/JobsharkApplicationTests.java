package com.jaws.jobshark;

import com.jaws.jobshark.models.User;
import com.jaws.jobshark.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class JobsharkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser() {
		User jeremy = new User("jeremy@gmail.com", "Jezza", "Croydon", "music");
		userRepository.save(jeremy);
	}

}
