package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//	http://localhost:8080/student
	// @GetMapping(path = "/student", produces=MediaType.APPLICATION_XML_VALUE)	-> to get XML o/p 
	@GetMapping("/student")
	public Student getStudent() {
//		SB by default uses Jackson2 library to convert JAVA object to JSON and JSON to JAVA object
		return new Student("Deepak", "Urs");
	}
}
