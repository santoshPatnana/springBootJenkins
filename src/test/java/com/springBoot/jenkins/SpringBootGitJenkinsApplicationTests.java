package com.springBoot.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootGitJenkinsApplicationTests {
	
	public static Logger log = LoggerFactory.getLogger(SpringBootGitJenkinsApplication.class);
	
	@Test
	void contextLoads() {
		log.info("With in test case...");
		assertEquals(true, true);
	}

}
