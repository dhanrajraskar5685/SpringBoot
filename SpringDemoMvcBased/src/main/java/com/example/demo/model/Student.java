package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student {

	@Id
	private int sid;
	
	private String ename;
	
	private String eaddress;
	
	private String uname;
	
	private String upass;
	
	
	private String fname;
	
	private String dpath;
	
	@Lob
	private byte[] fdata;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDpath() {
		return dpath;
	}

	public void setDpath(String dpath) {
		this.dpath = dpath;
	}

	public byte[] getFdata() {
		return fdata;
	}

	public void setFdata(byte[] fdata) {
		this.fdata = fdata;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", ename=" + ename + ", eaddress=" + eaddress + ", uname=" + uname + ", upass="
				+ upass + ", fname=" + fname + ", dpath=" + dpath + ", fdata=" + Arrays.toString(fdata) + "]";
	}

	
	
}
