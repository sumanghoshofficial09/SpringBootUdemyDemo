package com.example.demo.commanLineRunners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.example.demo.repository.CustomerRepository;


@Component
public class CustomerJdbcCommandLineRunner implements CommandLineRunner {

	
	@Autowired
	private CustomerRepository  repository;
	@Override
	public void run(String... args) throws Exception {
		
		
		repository.insert(new com.example.demo.entity.Customer(23,"sqd"));
		
		System.out.println("=========================================");
		System.out.println(repository.findById(23));
		System.out.println("=========================================");
		
		repository.deleteById(5);
		
		
	}

}
