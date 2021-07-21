package com.example.demo.entity;

public class Hour {
	private Integer total_worked_hours;
	private boolean success;
	
	public Integer getTotal_worked_hours() {
		return total_worked_hours;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setTotal_worked_hours(Integer total_worked_hours) {
		this.total_worked_hours = total_worked_hours;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
