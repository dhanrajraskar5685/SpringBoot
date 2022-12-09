package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService1;

@Controller
public class StudentController {

	@Autowired
	private StudentService1 studentService;

	@RequestMapping(value ="/")
	public String getIndexPage() {

		System.out.println("index Page Called");
		return "index";
	}

	@RequestMapping(value ="/reg")
	public String getRegisterPage(@ModelAttribute Student student) {
		System.out.println("register Page Called" + student);
		studentService.showStudent(student);
		return "login";

	}

	@RequestMapping(value = "/log")
	public String getlogin(@RequestParam String uname, @RequestParam String upass, Model m) {

		System.out.println(uname + "" + upass);
		List<Student> list = studentService.getAllData(uname, upass);

		if (!list.isEmpty()) {
			m.addAttribute("s", list);
			return "success";
		}
		return "login";
	}

	@RequestMapping(value = "/edit")
	public String editSingleStuydent(@RequestParam int sid, Model m) {
		Student student = studentService.getSingleStudent(sid);
		m.addAttribute("s", student);
		return "edit";
	}

	@RequestMapping(value = "/up")
	public String updateStudent(@ModelAttribute Student student, Model m) {

		List<Student> list = studentService.getCheckUpdate(student);
		m.addAttribute("s", list);
		return "index";
	}

	@RequestMapping(value = "/del")
	public String updateStudent(@RequestParam int sid, Model m) {
		List<Student> list = studentService.afterdelete(sid);
		m.addAttribute("s", list);
		return "index";
	}
}
