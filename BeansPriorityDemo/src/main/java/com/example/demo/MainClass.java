package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	
		System.out.println(context.getBean(Person.class));
	}

}
