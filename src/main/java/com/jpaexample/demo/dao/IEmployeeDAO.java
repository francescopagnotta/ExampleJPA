package com.jpaexample.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpaexample.demo.model.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> , IEmployeeDAOCustom{

	@Query(value = "SELECT e FROM Employee e WHERE e.nome LIKE '%' || :name || '%'"
           )
    public List<Employee> searchName(@Param("name") String name);

	//public Employee getPagnotta();
	
}
