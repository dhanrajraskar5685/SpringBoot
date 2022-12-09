package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	void addstudentData(Student student);

	List<Student> getallData();

	Student getSinglestudent(int sid);

	List<Student> getIUpdatedData(Student student);
	
	List<Student> afterdelete(int sid);
}
