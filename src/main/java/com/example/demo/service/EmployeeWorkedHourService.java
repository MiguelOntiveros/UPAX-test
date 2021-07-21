package com.example.demo.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeWorkedHour;
import com.example.demo.entity.Hour;
import com.example.demo.entity.Pay;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeWorkedHourRepository;
import com.example.demo.repository.JobRepository;

@Service
public class EmployeeWorkedHourService {
	
	@Autowired
	EmployeeWorkedHourRepository employeeWorkedHourRepository;
	
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Hour getEmployeeWorkedHour(Integer employee_id, Date firstDate, Date secondDate){
		Hour hour = new Hour();
		LocalDate firstDateToCompare = firstDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate secondDateToCompare = secondDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Integer totalHours = 0;
		if( firstDateToCompare.compareTo(secondDateToCompare) < 0 || employee_id != null ) {
			List<EmployeeWorkedHour> employeeWorkedHourList =  employeeWorkedHourRepository.getEmployees(employee_id, firstDate, secondDate);
				for (EmployeeWorkedHour list : employeeWorkedHourList) {
					totalHours = totalHours + list.getWorked_hours();
				}
			hour.setTotal_worked_hours(totalHours);
			hour.setSuccess(true);
			return hour;
		}
		
		else {
			hour.setTotal_worked_hours(null);
			hour.setSuccess(false);
			return hour;
		}
		
	}
	
	public Pay getEmployeePayment(Integer employee_id, Date firstDate, Date secondDate){
		Pay pay =  new Pay();
		Integer job_id = employeeRepository.getJobId(employee_id);
		Integer salary = jobRepository.getSalary(job_id);
		Integer paymentPerHour = salary / 8;
		
		LocalDate firstDateToCompare = firstDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate secondDateToCompare = secondDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Integer totalHours = 0;
		if( firstDateToCompare.compareTo(secondDateToCompare) < 0 || employee_id != null) {
			List<EmployeeWorkedHour> employeeWorkedHourList =  employeeWorkedHourRepository.getEmployees(employee_id, firstDate, secondDate);
				for (EmployeeWorkedHour list : employeeWorkedHourList) {
					totalHours = totalHours + list.getWorked_hours();
				}
				pay.setPayment(paymentPerHour * totalHours);
				pay.setSuccess(true);
				return pay;
		}
		
		else {
			pay.setPayment(paymentPerHour * totalHours);
			pay.setSuccess(false);
			return pay;
		}
		
	}

}
