package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.deto.ResponseDto;
import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService ls;

	@PostMapping(value = "/reg")
	public String registerWithloginData(@RequestBody Login login) {

		System.out.println("In controller All Data" + login);
		ls.addLogingDataWithCustomer(login);
		return "Register Successfully....";

	}

	@GetMapping(value = "/log")
	public ResponseDto getLoginData(@RequestParam String uname, @RequestParam String upass) {
		System.out.println("Login Data : " + uname + " " + upass);
		ResponseDto responseDto = ls.getallData(uname, upass);
		return responseDto;
	}

}
