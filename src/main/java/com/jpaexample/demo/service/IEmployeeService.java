package com.jpaexample.demo.service;

import java.util.List;

import com.jpaexample.demo.model.Employee;

public interface IEmployeeService {

	
	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(int id);
	
	Employee getCognome();
	
	Employee getByName(String name);
	
	void addEmployee(Employee e);
	
}
