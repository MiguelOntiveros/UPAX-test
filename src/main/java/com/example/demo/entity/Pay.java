package com.example.demo.entity;

public class Pay {
	private Integer payment;
	private boolean success;
	
	public Integer getPayment() {
		return payment;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
