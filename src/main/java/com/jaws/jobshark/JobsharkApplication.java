package com.jaws.jobshark;

import com.jaws.jobshark.models.User;
import com.jaws.jobshark.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JobsharkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsharkApplication.class, args);
	}

}