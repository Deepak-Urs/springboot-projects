package net.group.sms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.group.sms.repository.StudentRepository;
import net.group.sms.entity.Student;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
//		Student st1 = new Student("Deepak", "Urs", "deepak@gmail.com");
//		studentRepository.save(st1);
//		
//		Student st2 = new Student("A", "B", "urs@gmail.com");
//		studentRepository.save(st2);
//		
//		Student st3 = new Student("C", "D", "gv@gmail.com");
//		studentRepository.save(st3);
//		
//		Student st4 = new Student("E", "F", "dugv@gmail.com");
//		studentRepository.save(st4);
		
		
		
	}

}
