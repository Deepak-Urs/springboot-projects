package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;


//@Repository -> not needed as JpaRepository<> itself gives the recognition

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
