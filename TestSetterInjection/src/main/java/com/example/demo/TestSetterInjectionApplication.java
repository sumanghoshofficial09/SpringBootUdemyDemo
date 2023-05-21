package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Business
{
	
	Dependency1 d1;
	
	Dependency2  d2;

	public Dependency1 getD1() {
		return d1;
	}

	
/**
 * 
 * @param d1
 * 
 * 
 * @autowired annotation is compulsory for setter injection
 */
	@Autowired
	public void setD1(Dependency1 d1) {
		this.d1 = d1;
	}

	public Dependency2 getD2() {
		return d2;
	}


	@Autowired
	public void setD2(Dependency2 d2) {
		this.d2 = d2;
	}

	@Override
	public String toString() {
		return "Business [d1=" + d1 + ", d2=" + d2 + "]";
	}
	
	
	
	
	
}



@Component
class Dependency1
{
	
}

@Component
class Dependency2
{
	
}



@Configuration
@SpringBootApplication
public class TestSetterInjectionApplication {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(TestSetterInjectionApplication.class))
		{
			
			System.out.println(context.getBean(Business.class));
			
		}
	}

}
