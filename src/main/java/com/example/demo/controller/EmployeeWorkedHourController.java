package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hour;
import com.example.demo.entity.Pay;
import com.example.demo.repository.EmployeeWorkedHourRepository;
import com.example.demo.service.EmployeeWorkedHourService;

@RestController
@CrossOrigin()
@RequestMapping("/employeeworkedhour")
public class EmployeeWorkedHourController{
	
	@Autowired
	EmployeeWorkedHourRepository employeeWorkedHourRepository;
	
	@Autowired
	EmployeeWorkedHourService employeeWorkedHourService;
	
	//Web Service 4
	@GetMapping("/worked-hours")
	public Hour getEmployees(@RequestParam("employee_id") Integer employee_id, @RequestParam("start_date") Date start_date, @RequestParam("end_date") Date end_date) {
		return employeeWorkedHourService. getEmployeeWorkedHour(employee_id, start_date, end_date);
	}
	
	//Web Service 5
	@GetMapping("/pay")
	public Pay getPay(@RequestParam("employee_id") Integer employee_id, @RequestParam("start_date") Date start_date, @RequestParam("end_date") Date end_date) {
		return employeeWorkedHourService.getEmployeePayment(employee_id, start_date, end_date);
	}
	
}
