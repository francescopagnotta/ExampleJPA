package com.jpaexample.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaexample.demo.model.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

	
	
}
