package com.example.demo.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contrato;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.JobRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	JobRepository jobRepository;
	
	public Contrato insertEmployee(Employee employee) {
		Contrato contrato = new Contrato();
		LocalDate birthday = employee.getBirthdate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date currentDate = new Date();
		LocalDate currentDateCompare = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Long age = ChronoUnit.YEARS.between(birthday, currentDateCompare); 
		String ageString = age.toString();
		Integer ageInt = Integer.parseInt(ageString);
		String name = employeeRepository.getName(employee.getName());
		if(name == null) {
			name = "";
		}
		String lastName = employeeRepository.getLastName(employee.getLast_name());
		if(lastName == null) {
			lastName = "";
		}
		String job = jobRepository.getJob(employee.getJob_id());
		if(job == null) {
			job = "";
		}
		if (ageInt >= 18 && name.equals("") && lastName.equals("") && !job.equals("")) {
			employeeRepository.save(employee);
			contrato.setId(employee.getId());
			contrato.setSuccess(true);
			return contrato;
		}
		else {
			contrato.setId(null);
			contrato.setSuccess(false);
			return contrato;
		}
	}

}
