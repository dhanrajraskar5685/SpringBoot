package com.example.demo.service;

import com.example.demo.controller.EmployeeNotFound;
import com.example.demo.model.Employee;

public interface EmployeeService {

	

	Employee getEmployeeUsingName(String name)throws EmployeeNotFound;
}
