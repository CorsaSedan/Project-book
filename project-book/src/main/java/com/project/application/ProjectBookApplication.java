package com.project.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.project.*")
@EntityScan("com.project.model")
@EnableJpaRepositories("com.project.dao")
public class ProjectBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBookApplication.class, args);
	}

}
