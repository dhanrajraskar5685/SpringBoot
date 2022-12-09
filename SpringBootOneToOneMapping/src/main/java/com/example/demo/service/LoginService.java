package com.example.demo.service;

import com.example.demo.deto.ResponseDto;
import com.example.demo.model.Login;

public interface LoginService {

	void addLogingDataWithCustomer(Login login);

	ResponseDto getallData(String uname, String upass);

}
