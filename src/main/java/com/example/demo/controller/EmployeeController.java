package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contrato;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin()
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Web Service 1
	@PostMapping("/add")
	public Contrato addEmployee(@RequestBody Employee employee) {
		return  employeeService.addEmployee(employee);
	}
	
	//Web Service 2
	@GetMapping("/all")
	public List<Employee> getEmployees(@RequestParam("job_id") Integer job_id) {
		return employeeService.getEmployees(job_id);
	}
	
}
