package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentServiceImp implements StudentService1 {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void showStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("service layer" + student);
		studentDao.showStudent(student);

	}

	@Override
	public List<Student> getAllData(String uname, String upass) {
		// TODO Auto-generated method stub
		return studentDao.getAllData(uname, upass);
	}

	@Override
	public Student getSingleStudent(int sid) {
		// TODO Auto-generated method stub
		return studentDao.getSingleStudent(sid);
	}

	@Override
	public List<Student> getCheckUpdate(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getCheckUpdate(student);
	}

	@Override
	public List<Student> afterdelete(int sid) {
		// TODO Auto-generated method stub
		return studentDao.afterdelete(sid);
	}


	

}
