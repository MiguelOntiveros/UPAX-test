package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "JOBS")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name_;
	private Integer salary;
	
	public Long getId() {
		return id;
	}
	public String getName_() {
		return name_;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
