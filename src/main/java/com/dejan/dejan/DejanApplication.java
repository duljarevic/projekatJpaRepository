package com.dejan.dejan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.dejan.dejan.repository")
@SpringBootApplication
public class DejanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DejanApplication.class, args);
	}
}
