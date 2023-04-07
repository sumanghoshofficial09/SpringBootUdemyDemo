package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public Person person()
	{
		Person person = new Person("suman", 33);
		
		return person;
	}

}
