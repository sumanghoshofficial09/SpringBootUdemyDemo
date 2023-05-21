package com.example.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.calculation.BusinessCalculation;

@Configuration
@ComponentScan("com.example")
public class MainClient {
	
	public static void main(String args[])
	{
		var context = new AnnotationConfigApplicationContext(MainClient.class);
		
		BusinessCalculation businessCalculation  = context.getBean(BusinessCalculation.class);
		
		businessCalculation.provideCalculation();
	}

}
