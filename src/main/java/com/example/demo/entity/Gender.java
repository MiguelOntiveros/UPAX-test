package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "GENDERS")
public class Gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name_;
	
	public Long getId() {
		return id;
	}
	public String getName_() {
		return name_;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
}
