package com.example.jemkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JemkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(JemkinsApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("Application starter....");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JemkinsApplication.class, args);
	}

}
