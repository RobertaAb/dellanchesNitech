package com.nitech.dellanche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
public class DellancheApplication {
	public static void main(String[] args) {
		SpringApplication.run(DellancheApplication.class, args);
	}

}
