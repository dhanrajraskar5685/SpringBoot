package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@PostMapping(value = "/addEmpDepart")
	public String getEmpData(@RequestBody Employee employee) {

		System.out.println("Departement check"+employee);
		es.addEmpData(employee);
		return "Department Allocated to Employee";

	}

	@GetMapping(value = "/get/{eid}")
	public Employee getSingleData(@PathVariable int eid) {

		return es.getSingleDataEmployee(eid);
	}

	@PutMapping(value = "/up")
	public List<Employee> getUpdatedEmployee(@RequestBody Employee employee) {

		return es.getIUpdatedData(employee);
	}

	@DeleteMapping(value = "/del/{eid}")
	public List<Employee> delete(@PathVariable int eid) {
		System.out.println("Employee Delete" + eid);
		return es.afterdelete(eid);

	}
}