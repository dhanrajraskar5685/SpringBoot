package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;

public interface EmployeeService {

	Employee addEmployeeData(Employee employee);

	EmployeeDto getEmployee(String uname, String upass);

	Employee getEmployeeUsingID(int sid);

	List<Employee> getAllData();
	
	List<Employee> getUpdatedData(Employee employee);
	
	List<Employee> afterDelete(int sid);
}
