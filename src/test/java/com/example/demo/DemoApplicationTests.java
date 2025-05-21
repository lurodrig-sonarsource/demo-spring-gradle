package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
        try {
            Thread.sleep(60000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
