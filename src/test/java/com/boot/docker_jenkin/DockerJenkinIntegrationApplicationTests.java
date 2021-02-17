package com.boot.docker_jenkin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerJenkinIntegrationApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(DockerJenkinIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.error("Test case Executing........");
		logger.error("Test case Executing........Second Time");
		logger.error("Test case Executing........Fourth Time");
		assertEquals(true, true);
	}

}
