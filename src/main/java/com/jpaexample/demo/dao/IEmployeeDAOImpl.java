package com.jpaexample.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.jpaexample.demo.model.Employee;


public  class IEmployeeDAOImpl implements IEmployeeDAOCustom {

	@PersistenceContext
	 EntityManager em;

	
	@Override
	public Employee getPagnotta() {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);

		 Predicate cognome = cb.equal(root.get("cognome"), "PAGNOTTA");
	        
	        query.where(cognome);

	        TypedQuery<Employee> q = em.createQuery(query);
	        return q.getResultList().get(0);
		
	}
	
}
