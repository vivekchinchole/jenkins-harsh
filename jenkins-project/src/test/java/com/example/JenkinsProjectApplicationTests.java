package com.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsProjectApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplication.class);

	@Test
	public  contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);	}

}
