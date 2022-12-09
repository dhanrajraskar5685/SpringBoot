package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService cs;

	@PostMapping(value = "/addcom")
	public String addComapnyAndEmployee(@RequestBody Company company) {
		System.out.println("in controller:" + company);
		cs.addCompanyData(company);
		return "Succssfully";

	}

}
