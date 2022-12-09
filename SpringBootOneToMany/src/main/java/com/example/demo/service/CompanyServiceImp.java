package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repo.CompanyRepositry;

@Service
public class CompanyServiceImp implements CompanyService {

	@Autowired
	private CompanyRepositry cr;

	@Override
	public void addCompanyData(Company company) {
		// TODO Auto-generated method stub

		System.out.println("Company Service Data" + company);
		cr.save(company);

	}

}
