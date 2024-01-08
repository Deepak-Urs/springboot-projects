package net.group.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
	
	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users = new ArrayList<>();
		users.add(new User("A", "ab@gmail.com", "ADMIN"));
		users.add(new User("C", "cd@gmail.com", "USER"));
		users.add(new User("E", "ef@gmail.com", "USER"));
		users.add(new User("G", "gh@gmail.com", "USER"));
		users.add(new User("I", "ij@gmail.com", "ADMIN"));
		model.addAttribute("users", users);
		return "helloworld";
	}
	
	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user = new User("A", "ab@gmail.com", "ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
}
