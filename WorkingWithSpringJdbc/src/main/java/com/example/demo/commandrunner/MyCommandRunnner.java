package com.example.demo.commandrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.pojo.MyCourse;
import com.example.demo.repository.CourseJdbcRepository;

@Component
public class MyCommandRunnner implements CommandLineRunner {
	
	CourseJdbcRepository  repo;

	public MyCommandRunnner(CourseJdbcRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void run(String... args) throws Exception {
		repo.deleteQueryByID(3); 
		repo.deleteQueryByID(2); 
		repo.deleteQueryByID(4); 
		repo.insertQuery(new MyCourse(2, "Dynamic programming ", "Jan Does"));
		repo.insertQuery(new MyCourse(3, "Graph  Theory  ", "hello"));
		repo.insertQuery(new MyCourse(4, "Sql ", "Hii"));
		
		/////////////////////////////////////////////////////
		/*
		 * repo.deleteQueryByID(3); repo.deleteQueryByName("Sql");
		 */
		
		
	System.out.println("course we got by "+repo.getCourseByID(3));
	}

}
