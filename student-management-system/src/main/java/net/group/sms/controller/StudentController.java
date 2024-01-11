package net.group.sms.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.group.sms.service.StudentService;
import net.group.sms.entity.Student;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
//	 handler method to handle list students and return model and view
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents());
		return "students"; // view-name
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student st= new Student();
		model.addAttribute("student", st);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
}
