package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	void addEmpData(Employee employee);

	Employee getSingleDataEmployee(int eid);

	List<Employee> getIUpdatedData(Employee employee);

	List<Employee> afterdelete(int eid);
}
