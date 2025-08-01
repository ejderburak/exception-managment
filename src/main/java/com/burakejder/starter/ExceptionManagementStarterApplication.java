package com.burakejder.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@EntityScan(basePackages = {"com.burakejder"})
@EnableJpaRepositories(basePackages = {"com.burakejder"})
@ComponentScan(basePackages = {"com.burakejder"})
@SpringBootApplication
public class ExceptionManagementStarterApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExceptionManagementStarterApplication.class, args);
	}

}
