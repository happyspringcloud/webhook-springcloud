package com.springcloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebhookSpringcloudApplicationTests {

	@Test
	void contextLoads() {
		ControllerTest ctlTest = new ControllerTest();
		ctlTest.testIt();
	}

}
