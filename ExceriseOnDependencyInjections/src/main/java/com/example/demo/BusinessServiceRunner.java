package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DataServices;
import com.example.demo.service.BusinessCalculationService;

@Configuration
@ComponentScan("com.example.demo")
public class BusinessServiceRunner {
	
	public static void main(String args[])
	{
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessServiceRunner.class))
		{
		
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
		
	}

}
