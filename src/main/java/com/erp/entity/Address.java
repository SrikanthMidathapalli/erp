package com.erp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "addressdetails")
@Setter
@Getter
public class Address {
	@Id
	@Column(unique=true, nullable=false)
	private long a_id;
	private String h_address;
	private long phoneNumber;
	private String city;
	private long pincode;
	private String state;
	private String country;
	
	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "s_id") // @JsonBackReference private StudentData
	 * saddress;
	 */
	
	public Address(String h_address, long phoneNumber, String city, long pincode, String state, String country,
			StudentData saddress) {
		super();
		this.h_address = h_address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		//this.saddress = saddress;
	}

	/*
	 * public StudentData getSaddress() { return saddress; } public void
	 * setSaddress(StudentData saddress) { this.saddress = saddress; }
	 */
	public long getA_id() {
		return a_id;
	}
	public void setA_id(long a_id) {
		this.a_id = a_id;
	}
	public String getH_address() {
		return h_address;
	}
	public void setH_address(String h_address) {
		this.h_address = h_address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
