package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeImp implements EmployeeService {

	@Autowired
	private EmployeeRepository ep;

	@Override
	public Employee addEmployeeData(Employee employee) {

		Date date = new Date(System.currentTimeMillis());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:sss");
		String joinDate = simpleDateFormat.format(date);
		employee.setJoinDate(joinDate);
		return ep.save(employee);

	}

	@Override
	public EmployeeDto getEmployee(String uname, String upass) {

		EmployeeDto employeeDto = new EmployeeDto();
		Employee employee = ep.findByUnameAndUpass(uname, upass);
		if (employee != null) {
			employeeDto.setId(employee.getEid());
			employeeDto.setName(employee.getUname());
			employeeDto.setUname(employee.getUpass());
			return employeeDto;
		} else {
			employeeDto.setErrorMsg("Employee not Found");
			return employeeDto;
		}
	}

	@Override
	public Employee getEmployeeUsingID(int sid) {
		// TODO Auto-generated method stub

		Optional<Employee> optional = ep.findById(sid);
		if (optional.isPresent()) {

			return optional.get();
		}
		return optional.get();
	}

	@Override
	public List<Employee> getAllData() {

		// TODO Auto-generated method stub
		return ep.findAll();
	}

	@Override
	public List<Employee> getUpdatedData(Employee employee) {
		// TODO Auto-generated method stub

		ep.save(employee);
		return ep.findAll();
	}

	@Override
	public List<Employee> afterDelete(int sid) {
		// TODO Auto-generated method stub

		System.out.println("Delete Sid" + sid);
		ep.deleteById(sid);
		return ep.findAll();
	}

}
