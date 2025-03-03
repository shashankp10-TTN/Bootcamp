package com.bootcamp.springboot_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssignmentApplication.class, args);
	}

	/*
		Q1. Create a sample spring boot application and configure H2 in memory database dependency.
			- refer pom.xml for this
		Q2. Configure few properties under application properties file and read there value under Main class.
			- refer application.properties and controller class
		Q3. Create a Employee table (id, name, designation) under H2 database and inserts few sample records under that table at startup.
			- refer service and entity folder
			- adding employees using @RequestBody, taking input from postman
		Q4. Enable actuator services and play around few endpoints it exposes.
		Q5. Enable devtools and play around by making changes.
			- refer pom.xml where I have added the required dependencies and tried playing with different api exposed by actuator

	 */
}
