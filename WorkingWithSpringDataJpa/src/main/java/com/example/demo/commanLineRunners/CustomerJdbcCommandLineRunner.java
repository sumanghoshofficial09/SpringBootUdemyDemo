package com.example.demo.commanLineRunners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.example.demo.repository.CustomerRepository;


@Component
public class CustomerJdbcCommandLineRunner implements CommandLineRunner {

	
	@Autowired
	private CustomerRepository  customerRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		customerRepository.save(new com.example.demo.entity.Customer(230,"sqdtyty"));
		
		System.out.println("=========================================");
		System.out.println(customerRepository.findById(230));
		System.out.println("=========================================");
		
		customerRepository.deleteById(5);
		
		
	}

}
