package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@RequestMapping(value ="check")
	
	public String getdata() {
		return "checking Done";
		
		
	}
	@RequestMapping(value ="/getstudent")
	public Student getSingleStudent() {
		Student student = new Student();
		student.setSid(123);
		student.setSname("Dhanraj");
		student.setAddress("pune");
		
		return student;	
	}
	
	@RequestMapping(value ="/getlist")
	public List<Student>getdata1(){
	List<Student> list=new ArrayList<Student>();
	Student student = new Student();
	student.setSid(1);
	student.setSname("xyzDhanraj");
	student.setAddress("pune");
	Student student1 = new Student();
	student1.setSid(2);
	student1.setSname("abcDhanraj");
	student1.setAddress("pune");
	list.add(student1);
	list.add(student);
			return list;
	}
}


