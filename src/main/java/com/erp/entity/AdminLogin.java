package com.erp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "adminlogincredential")
@Setter
@Getter
public class AdminLogin {
	@Id
	private long login_id;
	private String email; ;
	private String password;
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminLogin(String password) {
		super();
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
