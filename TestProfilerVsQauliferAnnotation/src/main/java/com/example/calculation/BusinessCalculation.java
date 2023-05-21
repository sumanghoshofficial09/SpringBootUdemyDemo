package com.example.calculation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.service.DataService;

@Component
public class BusinessCalculation {
	
	@Autowired
	@Qualifier("Mongo")
	DataService service;
	
	
	public void provideCalculation()
	{
		int max = Arrays.stream(service.retrieveData()).max().orElse(0);
		
		System.out.println("The max is "+max);
	}

}
