package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_WORKED_HOURS")
public class EmployeeWorkedHour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer employee_id;
	private Integer worked_hours;
	private String worked_date;

	public Long getId() {
		return id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public Integer getWorked_hours() {
		return worked_hours;
	}
	public String getWorked_date() {
		return worked_date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public void setWorked_hours(Integer worked_hours) {
		this.worked_hours = worked_hours;
	}
	public void setWorked_date(String worked_date) {
		this.worked_date = worked_date;
	}
}
