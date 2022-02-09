package com.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "department")
@Setter
@Getter
public class Department {
	@Id
	@Column(unique=true, nullable=false)
	private long d_id;
	private String dname;
	public long getD_id() {
		return d_id;
	}
	public void setD_id(long d_id) {
		this.d_id = d_id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	

}
