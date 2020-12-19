package com.jpaexample.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpaexample.demo.model.Employee;
import com.jpaexample.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService serviceRef;
	

    @GetMapping("/")
	public String mainPage(){
		return "Hello WOrld";
	}
	
	
	@RequestMapping("/getAllEmployee")
	public String getEmployeeList(Model model){
		List<Employee> empList=new ArrayList<Employee>();
		empList=serviceRef.getAllEmployee();
		//model.addAttribute("employeeList", empList);
		return empList.toString();
	}
	
	
	
}
