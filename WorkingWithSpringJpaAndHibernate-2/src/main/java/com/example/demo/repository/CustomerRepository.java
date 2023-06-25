package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepository {
	
	
	@PersistenceContext
	private EntityManager  entityManager;
	
	
	
	public void insert(Customer customer)
	{
		entityManager.merge(customer);
	}

	public Customer findById(int id) {
		return entityManager.find(Customer.class, id);
	
		
	}
	
	public void deleteById(int id) {
		Customer customerToBeDeleted= entityManager.find(Customer.class, id);
		
		entityManager.remove(customerToBeDeleted);
		
	
		
	}

}
