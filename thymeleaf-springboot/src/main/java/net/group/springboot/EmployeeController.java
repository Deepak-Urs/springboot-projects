package net.group.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {
	
	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("A", "B", "ab@gmail.com"));
		employees.add(new Employee("C", "D", "cd@gmail.com"));
		employees.add(new Employee("E", "F", "ef@gmail.com"));
		employees.add(new Employee("G", "H", "gh@gmail.com"));
		employees.add(new Employee("I", "J", "ij@gmail.com"));
		model.addAttribute("employees", employees);
		return "iteration";
	}
}
