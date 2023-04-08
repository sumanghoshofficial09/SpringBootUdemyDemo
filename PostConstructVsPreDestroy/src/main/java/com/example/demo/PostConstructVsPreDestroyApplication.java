package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;




@Component
class Connection
{
	
	public void connect()
	{
		System.out.println("Connnecting now ");
	}
	
	public void init()
	{
		
		System.out.println("initialize connection");
		
	}
	
	
	public void tearDown()
	{
		System.out.println("Shutting down connection ");
	}
	
}


@Component
class MyDao
{
	
	Connection connection;
	
	
	
	
  public MyDao(Connection connection) {
		super();
		this.connection = connection;
		System.out.println("Constructor injection happening ");
	}


  
  @Override
public String toString() {
	return "MyDao [connection=" + connection + "]";
}



@PostConstruct
public void initializeConnection()
{
	
	System.out.println("post construct");
	
	connection.init();
}
  
  
  @PreDestroy
 public void tearDownConnection()
 {
	  System.out.println("Predetroy");
	 connection.tearDown();
 }
public void makeConnection()
  {
	  connection.connect();
  }
	
	
	
}

@Configuration
@ComponentScan
public class PostConstructVsPreDestroyApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(PostConstructVsPreDestroyApplication.class);
		
		System.out.println(context.getBean(MyDao.class).toString());
		
		
	}

}
