package com.govind.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class InternshipAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternshipAssignmentApplication.class, args);
	}

}
