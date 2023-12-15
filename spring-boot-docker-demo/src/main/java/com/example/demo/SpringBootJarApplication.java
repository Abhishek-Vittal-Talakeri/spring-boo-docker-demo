package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringBootJarApplication {
	
	
	//I am addinf for testing

	public static Logger log = LoggerFactory.getLogger(SpringBootJarApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application is strarted");
	}

	public static void main(String[] args) {

		log.info("Application is executed");

		SpringApplication.run(SpringBootJarApplication.class, args);
	}

	@GetMapping("/test")
	public String test() {

		return "Test Messges";
	}

}
