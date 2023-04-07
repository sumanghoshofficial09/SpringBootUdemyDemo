package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.demo.sorting.Sorting;


@Configuration
@ComponentScan("com.example.demo.sorting")
@Component
public class PerfomSorting {
	
	@Autowired @Qualifier("quickSort")
	 	Sorting  sorting;
	
	
	public  void performSort()
	{
		sorting.sort();
	}
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerfomSorting.class);
		
		context.getBean(PerfomSorting.class).performSort();
	}
	
	

}
