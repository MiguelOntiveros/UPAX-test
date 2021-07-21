package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hour;
import com.example.demo.repository.EmployeeWorkedHourRepository;
import com.example.demo.service.EmployeeWorkedHourService;

@RestController
@CrossOrigin()
@RequestMapping("/employeeworkedhour")
public class EmployeeWorkedHourController {
	
	@Autowired
	EmployeeWorkedHourRepository employeeWorkedHourRepository;
	
	@Autowired
	EmployeeWorkedHourService employeeWorkedHourService;
	
	@GetMapping("/worked-hours")
	public Hour getEmployees(@RequestParam("employee_id") Integer employee_id, @RequestParam("firstDate") Date firstDate, @RequestParam("secondDate") Date secondDate) {
		return employeeWorkedHourService. getEmployeeWorkedHour(employee_id, firstDate, secondDate );
	}
	
}
