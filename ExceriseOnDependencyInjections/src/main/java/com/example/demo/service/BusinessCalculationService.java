package com.example.demo.service;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.example.demo.dao.DataServices;


@Component
public class BusinessCalculationService {
	
	DataServices  dataservices;

	public BusinessCalculationService(DataServices dataservices) {
		super();
		this.dataservices = dataservices;
		System.out.println("constructor injection");
	}
	
	
	public int findMax()
	{
		return Arrays.stream(dataservices.retrieveData()).max().getAsInt();
	}
	
	
	
	


}
