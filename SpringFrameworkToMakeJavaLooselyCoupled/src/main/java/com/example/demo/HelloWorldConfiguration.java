package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class HelloWorldConfiguration {
	
	
	@Bean
	public String name()
	{
		return "suman";
	}
	
	
	@Bean
	public int age()
	{
		return 33;
	}

}
