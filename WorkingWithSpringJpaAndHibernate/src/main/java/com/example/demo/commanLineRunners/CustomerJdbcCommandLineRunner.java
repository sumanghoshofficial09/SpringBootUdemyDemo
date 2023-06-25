package com.example.demo.commanLineRunners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entitirs.Customer;
import com.example.demo.repositories.CustomerjdbcRepository;


@Component
public class CustomerJdbcCommandLineRunner implements CommandLineRunner {

	
	@Autowired
	private CustomerjdbcRepository  repository;
	@Override
	public void run(String... args) throws Exception {
		
		
		//repository.insert(new Customer(5, "test2"));
		
		//repository.delete(3);
		
		System.out.println(repository.select(5));
		
		
	}

}
