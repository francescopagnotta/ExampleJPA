package com.jpaexample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaexample.demo.dao.IEmployeeDAO;
import com.jpaexample.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeDAO daoRef;
	
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return daoRef.getOne(id);
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		daoRef.save(e);
	}

}
