package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {

//	To make a java class a controller, we use @Controller
//	POSSIBLE REST APIS that could be written
//	get
//	post
//	put
//	delete
//	returns JSON/XML or other representational form to the client
//	To do the above , we use @ResponseBody
//  //@Controller + @ResponseBody are subset of @RestController 
	
//	To serve a method as a GET - REST API end point, we use @GetMapping
//  If a a client uses http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World! from first REST API";
	}
	
	@GetMapping("/hello-world-app")
	public String helloWorldApp() {
		return "Hello World App! from first REST API";
	}
}
