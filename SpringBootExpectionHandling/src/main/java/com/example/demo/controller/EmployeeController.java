package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.repo.ExcepationResponse;

@ControllerAdvice
public class EmployeeController {

	@ExceptionHandler(EmployeeNotFound.class)

	public @ResponseBody ExcepationResponse handleException(EmployeeNotFound exFound, HttpServletRequest request) {

		ExcepationResponse response = new ExcepationResponse();
		response.setErrorMsg(exFound.getMessage());
		response.setUrlApi(request.getRequestURI());
		return response;
	}
}
