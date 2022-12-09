package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repositry.CustomerRepositry;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepositry cr;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Customer getSingleCustomer(int id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

}
