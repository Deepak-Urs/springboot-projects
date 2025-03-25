package com.example.mycoolapp.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		System.out.print("Hello cool app!");
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
