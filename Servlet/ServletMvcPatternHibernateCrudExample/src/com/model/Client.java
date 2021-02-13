package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	private String cid;
	
	private String cname;
	
	private String caddress;
	
	private String cuname;
	
	private String cpass;
	
	private float csalary;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public float getCsalary() {
		return csalary;
	}

	public void setCsalary(float csalary) {
		this.csalary = csalary;
	}

	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", cuname=" + cuname + ", cpass="
				+ cpass + ", csalary=" + csalary + "]";
	}
	
	
	
	
}
