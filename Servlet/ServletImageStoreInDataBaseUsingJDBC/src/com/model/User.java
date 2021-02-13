package com.model;

import java.io.InputStream;

public class User {

	private int id;
	
	private String name;
	
	private String address;
	
	private InputStream fname;
	
	private String ftype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InputStream getFname() {
		return fname;
	}

	public void setFname(InputStream fname) {
		this.fname = fname;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", fname=" + fname + ", ftype=" + ftype
				+ "]";
	}
	
	
}
