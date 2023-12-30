package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//	http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
//		SB by default uses Jackson2 library to convert JAVA object to JSON and JSON to JAVA object
		return new Student("Deepak", "Urs");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
//		SB by default uses Jackson2 library to convert JAVA object to JSON and JSON to JAVA object
		List<Student> students = new ArrayList<>();
		students.add(new Student("Deepak", "Urs"));
		students.add(new Student("A", "B"));
		students.add(new Student("C", "D"));
		students.add(new Student("E", "F"));
		students.add(new Student("G", "H"));
		return students;
	}
	
//	http://localhost:8080/student/deepak/urs
//	@PathVariable -> used for capturing the dynamic data coming from the end point link
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	};
	
//	build REST API to handle query parameters
//	wrt path-variable, we do not see '?' and key-value pairs in them, they are more of direct variables
//	@RequestParam
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,  @RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
}
