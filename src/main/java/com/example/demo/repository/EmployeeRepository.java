package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Query( value = "SELECT NAME_ FROM EMPLOYEES WHERE name_ =:name", 
			  nativeQuery = true)
	String getName(String name);
	
	@Query( value = "SELECT LAST_NAME FROM EMPLOYEES WHERE last_name =:last_name", 
			  nativeQuery = true)
	String getLastName(String last_name);
}
