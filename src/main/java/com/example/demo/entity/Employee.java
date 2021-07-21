package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer gender_id;
	private Integer job_id;
	private String name_;
	private String last_name;
	private Date birthdate;
	
	public Long getId() {
		return id;
	}
	public Integer getGender_id() {
		return gender_id;
	}
	public Integer getJob_id() {
		return job_id;
	}
	public String getName() {
		return name_;
	}
	public String getLast_name() {
		return last_name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	public void setName(String name) {
		this.name_ = name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

}
