package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentDao {

	void showStudent(Student student);

	List<Student> getAllData(String uname, String upass);

	Student getSingleStudent(int sid);

	List<Student> getCheckUpdate(Student student);

	List<Student> afterdelete(int sid);

}
