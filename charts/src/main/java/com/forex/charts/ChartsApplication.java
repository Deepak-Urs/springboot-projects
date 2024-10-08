package com.forex.charts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ChartsApplication {

	public static void main(String[] args) {
		System.out.println("Charts App started!");
		SpringApplication.run(ChartsApplication.class, args);
//		System.out.println("Charts App started!");
	}

}
