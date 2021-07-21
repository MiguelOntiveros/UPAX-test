package com.example.demo.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeWorkedHour;
import com.example.demo.entity.Hour;
import com.example.demo.repository.EmployeeWorkedHourRepository;

@Service
public class EmployeeWorkedHourService {
	
	@Autowired
	EmployeeWorkedHourRepository employeeWorkedHourRepository;
	
	public Hour getEmployeeWorkedHour(Integer employee_id, Date firstDate, Date secondDate){
		Hour hour = new Hour();
		LocalDate firstDateToCompare = firstDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate secondDateToCompare = secondDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Integer totalHours = 0;
		//employee_id != null ||
		if( firstDateToCompare.compareTo(secondDateToCompare) < 0) {
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

}
