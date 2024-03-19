package com.springBoot.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootGitJenkinsApplication {
	
	public static Logger log = LoggerFactory.getLogger(SpringBootGitJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("With in post consturct...");
	}
	
	public static void main(String[] args) {
		log.info("With in main method ...");
		SpringApplication.run(SpringBootGitJenkinsApplication.class, args);
	}

}
