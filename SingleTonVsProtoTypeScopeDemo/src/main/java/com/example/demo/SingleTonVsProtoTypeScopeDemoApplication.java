package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component
@Scope(value ="singleton")
class MySingleTon
{
	
	
	
	
}



@Component
@Scope(value="prototype")
class MyProtoType
{
	
}


@Configuration
@ComponentScan
public class SingleTonVsProtoTypeScopeDemoApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SingleTonVsProtoTypeScopeDemoApplication.class);
		
		System.out.println(context.getBean(MySingleTon.class));
		System.out.println(context.getBean(MySingleTon.class));
		System.out.println(context.getBean(MySingleTon.class));
		
		System.out.println(context.getBean(MyProtoType.class));
		System.out.println(context.getBean(MyProtoType.class));
		System.out.println(context.getBean(MyProtoType.class));
		
	}

}
