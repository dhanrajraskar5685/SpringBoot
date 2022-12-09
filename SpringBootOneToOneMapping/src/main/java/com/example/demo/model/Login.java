package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	
	private String uname;
	
	private String upass;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Login [lid=" + lid + ", uname=" + uname + ", upass=" + upass + ", customer=" + customer + "]";
	}

}
