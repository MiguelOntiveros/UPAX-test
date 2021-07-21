package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long>{
	@Query( value = "SELECT NAME_ FROM JOBS WHERE id =:job_id", 
			  nativeQuery = true)
	String getJob(Integer job_id);
	
	@Query( value = "SELECT SALARY FROM JOBS WHERE id =:job_id", 
			  nativeQuery = true)
	Integer getSalary(Integer job_id);
}
