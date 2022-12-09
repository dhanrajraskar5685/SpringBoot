package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService ds;

	@PostMapping(value = "/addDepart")
	public String addDepartmentData(@RequestBody Department department) {

		System.out.println("Check Department Data" + department);

		ds.addDempData(department);
		return "Department Add";

	}

	@GetMapping(value = "/listDepart")
	public List<Department> getallDepartment() {

		return ds.getallDepartment();

	}
}
