package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int eid;
	
	private String ename;
	
	private String eaddress;
	
	private long esalary;
	
	private String uname;
	
	private String upass;
	
	private String joinDate;
	
	@Type(type = "yes_no")
	private boolean active;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public long getEsalary() {
		return esalary;
	}

	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalary=" + esalary
				+ ", uname=" + uname + ", upass=" + upass + ", joinDate=" + joinDate + ", active=" + active + "]";
	}

	

}
