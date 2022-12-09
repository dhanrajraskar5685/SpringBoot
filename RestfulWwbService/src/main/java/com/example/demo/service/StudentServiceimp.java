package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepositry;

@Service
public class StudentServiceimp implements StudentService {

	@Autowired
	private StudentRepositry sr;

	@Override
	public void addstudentData(Student student) {
		// TODO Auto-generated method stub

		System.out.println("in Service Repositry" + student);
		sr.save(student);

	}

	@Override
	public List<Student> getallData() {
		// TODO Auto-generated method stub

		List<Student> list = (List<Student>) sr.findAll();

		return list;
	}

	@Override
	public Student getSinglestudent(int sid) {
		// TODO Auto-generated method stub

		Student student = sr.findById(sid).get();
		return student;
	}

	@Override
	public List<Student> getIUpdatedData(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);

		return (List<Student>) sr.findAll();
	}

	@Override
	public List<Student> afterdelete(int sid) {
		// TODO Auto-generated method stub
		System.out.println("Delete id " + sid);
		sr.deleteById(sid);

		return (List<Student>) sr.findAll();

	}

}
