package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepositry;

@Repository
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentRepositry dr;

	@Override
	public void addDempData(Department department) {
		// TODO Auto-generated method stub
		System.out.println("Department Sevice" + department);

		dr.save(department);
	}

	@Override
	public List<Department> getallDepartment() {
		// TODO Auto-generated method stub

		return dr.findAll();
	}

}
