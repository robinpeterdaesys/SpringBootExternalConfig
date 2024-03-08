package com.programwind.springboot;

import com.programwind.springboot.controller.EmployeeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootExtConfigApplication extends SpringBootServletInitializer{

	@Value("${createdby}")
	private String createdBy;

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		Logger logger = LoggerFactory.getLogger(SpringBootExtConfigApplication.class);
		logger.info("Created By= " + createdBy);
		return () -> 42;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExtConfigApplication.class, args);
	}

}
