package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;

	@PostMapping(value = "/reg")

	public String toRegisterStudentData(@RequestBody Student student) {
		System.out.println("Register Data : " + student);
		ss.addstudentData(student);
		return "successfully Register.";
	}

	@GetMapping(value = "/data")
	public List<Student> getallData() {

		return ss.getallData();

	}

	@GetMapping(value = "/get{sid}")
	public Student getSingleStudent(@PathVariable("sid") int sid) {

		return ss.getSinglestudent(sid);

	}

	@PutMapping(value = "/up")
	public List<Student> getupdateAllData(@RequestBody Student student) {

		return ss.getIUpdatedData(student);

	}

	@DeleteMapping(value = "/del/{sid}")
	public List<Student> deleteData(@PathVariable int sid) {
		System.out.println("Student delete id" + sid);

		return ss.afterdelete(sid);

	}
}
