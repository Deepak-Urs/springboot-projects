package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
