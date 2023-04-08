package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/***
 * 
 * 
 * 
 * 
 * @author ciphe
 * 
 * showing demo about cosntructor injections 
 * 
 *
 */

@Component
class Baseclass
{
	
	private Dependency1 d1;
	
	private Dependency2 d2;

	public Baseclass(Dependency1 d1, Dependency2 d2) {
		
		super();
		this.d1 = d1;
		this.d2 = d2;
		System.out.println("construction injection calling ");
	}

	@Override
	public String toString() {
		return "Baseclass [d1=" + d1 + ", d2=" + d2 + "]";
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
@ComponentScan
public class InjectionsDemo {
	
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext  context  = new AnnotationConfigApplicationContext(InjectionsDemo.class);
		
		Baseclass  obj=context.getBean(Baseclass.class);
		
		System.out.println(obj);
		
		
	}

}
