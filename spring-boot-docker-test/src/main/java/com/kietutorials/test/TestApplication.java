package com.kietutorials.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		System.out.println("Application loaded!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		SpringApplication.run(TestApplication.class, args);
	}

}
