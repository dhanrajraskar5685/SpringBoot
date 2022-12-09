package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deto.ResponseDto;
import com.example.demo.model.Login;
import com.example.demo.repositry.LoginRepositry;

@Service
public class LogingServiceImp implements LoginService {

	@Autowired
	private LoginRepositry lr;

	@Override
	public void addLogingDataWithCustomer(Login login) {
		// TODO Auto-generated method stub
		System.out.println("Login Data With Customer In Service" + login);
		lr.save(login);
	}

	@Override
	public ResponseDto getallData(String uname, String upass) {
		// TODO Auto-generated method stub
		ResponseDto rd = new ResponseDto();
		Login login = lr.findByUnameAndUpass(uname, upass);
		if (login != null) {
			rd.setName(login.getCustomer().getCname());
			rd.setUname(login.getUname());
			rd.setEmailId(login.getCustomer().getEmailId());
		}
		return rd;
	}

}
