package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configuration.HelloWorldConfiguration;

public class SpringBeanUsageDemo {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println("The person 1 is "+context.getBean("personWithMethodCalls"));
		
		System.out.println("The person 2 is "+context.getBean("personWithParameters"));
	}

}
