package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.ObjectWriter;

@SpringBootApplication
public class SpringBootJsonObjectMappingApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(SpringBootJsonObjectMappingApplication.class, args);

		Student s = new Student();

		s.setSid(1);
		s.setSname("Dhanraj");
		s.setAddress("pune");
		System.out.println(s);
		// JAVA TO JSON CONVERT

		ObjectMapper o = new ObjectMapper();
		String str = o.writeValueAsString(s);
		System.out.println("Java To Json" + str);

		// json to java
		Student s1 = o.readValue(str, Student.class);
		System.out.println("json to java " + s1);
	}

}
