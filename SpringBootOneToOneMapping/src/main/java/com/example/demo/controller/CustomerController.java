package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@GetMapping(value = "/alldata")
	public List<Customer> getData() {
		return cs.getAllCustomer();

	}

@GetMapping(value = "/get/{id}",produces =MediaType.APPLICATION_XML_VALUE)	
	public Customer getSingleData(@PathVariable int id) {
		
		return cs.getSingleCustomer(id);
	}

}
