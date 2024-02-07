package com.group.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group.emsbackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//	now any class which implements EMployeeRepositoy will get access to work CRUD operations on Employee JPA entity 
}
