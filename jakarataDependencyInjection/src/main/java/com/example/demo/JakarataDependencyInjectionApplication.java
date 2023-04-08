package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;




@Named
class Depedency
{
	
}

@Named
class User
{
	private Depedency d1;

	public Depedency getD1() {
		return d1;
	}

	
	@Inject
	public void setD1(Depedency d1) {
		this.d1 = d1;
		System.out.println("Setter injection happening ");
	}


	@Override
	public String toString() {
		return "User [d1=" + d1 + "]";
	}
	
	
	
}
@Configuration
@ComponentScan
public class JakarataDependencyInjectionApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JakarataDependencyInjectionApplication.class);
		
		System.out.println(context.getBean(User.class).toString());
		
		
		
		
	}

}
