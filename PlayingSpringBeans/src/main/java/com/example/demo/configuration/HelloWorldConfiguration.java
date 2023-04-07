package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean(name ="myname")
	public String name()
	{
		return "suman";
	}
	
	
	@Bean(name ="myage")
	public int age()
	{
		return 33;
	}
	
	
	@Bean
	public Person personWithMethodCalls()
	{
		
		Person person1  = new Person(name(), age());
		
		return person1;
	}
	
	
	@Bean
	public Person personWithParameters(String myname, int myage)
	{

		Person person2  = new Person(myname, myage);
		
		return person2;
	}
	
	
	

}
