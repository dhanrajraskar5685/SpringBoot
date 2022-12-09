package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService1 {

	void showStudent(Student student);

	List<Student> getAllData(String uname, String upass);

	Student getSingleStudent(int sid);

	List<Student> getCheckUpdate(Student student);

	List<Student> afterdelete(int sid);
	
	
}