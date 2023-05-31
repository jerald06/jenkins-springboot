package com.example.jemkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class JemkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JemkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		Assert.assertEquals(true,true);
	}

}
