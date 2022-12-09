package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class HomeController {

	@Autowired
	private EmployeeService es;

	@PostMapping(value = "/addmap")
	public String addemployee(@RequestBody Employee employee) {
		System.out.println("Employee Data" + employee);

		Employee e = es.addEmployeeData(employee);
		if (e.getEid() > 0) {
			return "Successfully Register";
		}
		return "Not Register...";

	}

	@PostMapping(value = "/log")

	public EmployeeDto getEmployee(@RequestBody Employee employee) {

		System.out.println("login:" + employee);

		EmployeeDto e = es.getEmployee(employee.getUpass(), employee.getUpass());
		return e;

	}

	@GetMapping(value = "/log1")

	public EmployeeDto getloginEmployee(@RequestParam String uname, @RequestParam String upass) {

		System.out.println("login Data:" + uname + "" + upass);

		return es.getEmployee(uname, upass);

	}

	@GetMapping(value = "/get/{sid}")
	public Employee getSingleData(@PathVariable int sid) {

		return es.getEmployeeUsingID(sid);

	}

	@GetMapping(value = "/alldata")
	public List<Employee> getAllData() {
		return es.getAllData();
	}

	@PutMapping(value = "/up")
	public List<Employee> getUpdatedEmployee(@RequestBody Employee employee) {

		return es.getUpdatedData(employee);
	}

	@DeleteMapping(value = "/del/{sid}")
	public List<Employee> delete(@PathVariable int sid) {
		System.out.println("Employee Delete" + sid);
		return es.afterDelete(sid);
	}

}
