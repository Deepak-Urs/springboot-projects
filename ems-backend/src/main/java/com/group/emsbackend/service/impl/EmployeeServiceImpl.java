package com.group.emsbackend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.group.emsbackend.dto.EmployeeDto;
import com.group.emsbackend.entity.Employee;
import com.group.emsbackend.exception.ResourceNotFoundException;
import com.group.emsbackend.mapper.EmployeeMapper;
import com.group.emsbackend.repository.EmployeeRepository;
import com.group.emsbackend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee =  employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee is not found with given ID:" + employeeId));
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
				.collect(Collectors.toList());

	}

	@Override
	public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
		Employee empData = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id:"+employeeId));
		
		empData.setFirstName(updatedEmployee.getFirstName());
		empData.setLastName(updatedEmployee.getLastName());
		empData.setEmail(updatedEmployee.getEmail());
		
		Employee updatedEmpObject = employeeRepository.save(empData);
		return EmployeeMapper.mapToEmployeeDto(updatedEmpObject);
	}

	@Override
	public String deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		return "EmployeeID-"+employeeId+" details deletion successful";
	}

}
