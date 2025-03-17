package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int min = 0;
		int max = 9;
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(max - min) + min;
		if (random <= 5) {
		   System.out.println("Hello, low!");
		} else {
			System.out.println("Hello, up!");
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
