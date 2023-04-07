package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configuration.HelloWorldConfiguration;

public class App2Demo {
	
	
	
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println("Here is the person details "+context.getBean("person"));
	}

}
