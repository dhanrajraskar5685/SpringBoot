package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.controller.EmployeeNotFound;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee getEmployeeUsingName(String name) throws EmployeeNotFound {

		List<Employee> list = new ArrayList<Employee>();

		Employee em = new Employee();
		em.setId(1);
		em.setName("Dhanraj");
		em.setAddress("pune");
		Employee em1 = new Employee();
		em1.setId(2);
		em1.setName("DhanrajRao");
		em1.setAddress("pmc");
		Employee em2 = new Employee();
		em2.setId(3);
		em2.setName("Raj");
		em2.setAddress("mumbai");
		list.add(em);
		list.add(em1);
		list.add(em2);

		Employee emp = null;
		for (Employee e : list) {
			if (e.getName().equals(name)) {
				emp = e;
				break;
			}
		}
		System.out.println(emp);
		if (emp != null) {
			System.out.println(name);
			return emp;
		} else {

			throw new EmployeeNotFound("Employee Not Exist");
		}
	}

}
