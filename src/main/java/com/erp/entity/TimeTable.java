package com.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "timetable")
@Setter
@Getter
public class TimeTable {
	@Id
	@Column(unique=true, nullable=false)
	private int Serial_number;
	private String monday;
	private String tuesday;
	private String wendesday;
	private String thursday;
	private String friday;
	private String saturday;
	private String sunday;
	public int getSerial_number() {
		return Serial_number;
	}
	public void setSerial_number(int serial_number) {
		Serial_number = serial_number;
	}
	public String getMonday() {
		return monday;
	}
	public void setMonday(String monday) {
		this.monday = monday;
	}
	public String getTuesday() {
		return tuesday;
	}
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	public String getWendesday() {
		return wendesday;
	}
	public void setWendesday(String wendesday) {
		this.wendesday = wendesday;
	}
	public String getThursday() {
		return thursday;
	}
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	public String getFriday() {
		return friday;
	}
	public void setFriday(String friday) {
		this.friday = friday;
	}
	public String getSaturday() {
		return saturday;
	}
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}
	public String getSunday() {
		return sunday;
	}
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	public TimeTable(String monday, String tuesday, String wendesday, String thursday, String friday, String saturday,
			String sunday) {
		super();
		this.monday = monday;
		this.tuesday = tuesday;
		this.wendesday = wendesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}
	public TimeTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
