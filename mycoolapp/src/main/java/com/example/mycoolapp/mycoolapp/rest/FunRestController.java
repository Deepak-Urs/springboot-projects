package com.example.mycoolapp.mycoolapp.rest;

//import org.springframework.stereotype.Controller;
//import org.springframework.*;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
}