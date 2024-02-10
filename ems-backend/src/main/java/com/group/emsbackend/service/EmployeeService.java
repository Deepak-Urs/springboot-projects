package com.group.emsbackend.service;

import java.util.List;

import com.group.emsbackend.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long employeeId);
	
	List<EmployeeDto> getAllEmployees();
}
