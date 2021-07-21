package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmployeeWorkedHour;

public interface EmployeeWorkedHourRepository extends JpaRepository<EmployeeWorkedHour, Long>{
	@Query( value = "SELECT * FROM EMPLOYEE_WORKED_HOURS WHERE employee_id=:employee_id"
			+ " AND WORKED_DATE BETWEEN :firstDate and :secondDate", 
			  nativeQuery = true)
	List<EmployeeWorkedHour> getEmployees(Integer employee_id, @Param("firstDate")Date firstDate, @Param("secondDate") Date secondDate);
	
}
