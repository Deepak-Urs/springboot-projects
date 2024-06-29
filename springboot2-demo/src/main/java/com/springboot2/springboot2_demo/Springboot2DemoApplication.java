package com.springboot2.springboot2_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot2DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring Boot!");
		SpringApplication.run(Springboot2DemoApplication.class, args);
		
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot2DemoApplication);
//		SpringComponent sc = applicationContext.getBean(SpringComponent.class);
//		System.out.println(applicationContext);
	}

}
