package com.example.spring_demo_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);
	}

}
