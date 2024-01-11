package net.group.sms.service;

import java.util.List;

import net.group.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
}
