package com.cognizant.spring.userreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant.spring")
public class UserRegistrationSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationSpringBootApplication.class, args);
	}
}
