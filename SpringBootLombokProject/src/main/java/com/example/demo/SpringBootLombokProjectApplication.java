package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;

@SpringBootApplication
public class SpringBootLombokProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokProjectApplication.class, args);
		
		
		
		Employee e = new Employee();
	
		e.setEid(1);
		e.setEname("Dhanraj");
		e.setAadress("Pune");
		System.out.println(e);
	}

}
