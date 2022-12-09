package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${output.message}")
	private String msg;
	
	@RequestMapping(value="/")
	public String valueCheck() {
		return msg;
		
		
		
		
	}
}
