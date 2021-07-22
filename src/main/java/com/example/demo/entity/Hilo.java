package com.example.demo.entity;

import java.util.Date;

public class Hilo {
	private Integer gender_id;
	private Integer job_id;
	private String name;
	private String last_name;
	private Date birthdate;
	private boolean success;
	
	public Integer getGender_id() {
		return gender_id;
	}
	public Integer getJob_id() {
		return job_id;
	}
	public String getName() {
		return name;
	}
	public String getLast_name() {
		return last_name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
