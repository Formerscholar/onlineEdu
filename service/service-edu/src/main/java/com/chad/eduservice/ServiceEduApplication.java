package com.chad.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.chad")
public class ServiceEduApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceEduApplication.class, args);
	}
}
