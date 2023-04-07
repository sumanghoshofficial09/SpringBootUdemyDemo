package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


 record Person(String name,int age) {}
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	@Primary
	public Person person1()
	{
		return new Person("suman", 33);
	}
	
	@Bean
	public Person person2()
	{
		return new Person("puja", 33);
	}

}
