package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.JobRepository;

@RestController
@CrossOrigin()
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	JobRepository jobRepository;
	
	@GetMapping("/job")
	public String getAll(Integer job_id){
		return jobRepository.getJob(job_id);
	}
	
	@GetMapping("/salary")
	public Integer getSalary(Integer job_id){
		return jobRepository.getSalary(job_id);
	}
}
