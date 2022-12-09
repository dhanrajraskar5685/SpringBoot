package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepositry;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepositry er;

	@Override
	public void addEmpData(Employee employee) {
		// TODO Auto-generated method stub

		System.out.println("Employee service " + employee);

		er.save(employee);
	}

	@Override
	public Employee getSingleDataEmployee(int eid) {
		// TODO Auto-generated method stub
		return er.findById(eid).get();
	}

	@Override
	public List<Employee> getIUpdatedData(Employee employee) {
		// TODO Auto-generated method stub

		er.save(employee);
		return er.findAll();
	}

	@Override
	public List<Employee> afterdelete(int eid) {
		// TODO Auto-generated method stub
		er.deleteById(eid);
		return er.findAll();
	}

}
