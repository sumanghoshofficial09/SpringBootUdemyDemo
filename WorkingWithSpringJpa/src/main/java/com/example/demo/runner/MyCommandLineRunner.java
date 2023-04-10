package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Courses;
import com.example.demo.repository.CourseRepository;


@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	
	@Autowired
	CourseRepository repo;

	@Override
	public void run(String... args) throws Exception {
	  repo.insert(new Courses(1, "check1", "hello1"));
	  repo.insert(new Courses(2, "check2", "hello2"));
	  repo.insert(new Courses(3, "check3", "hello3"));
	  repo.insert(new Courses(4, "check4", "hello4"));
	  repo.insert(new Courses(5, "check5", "hello5"));
	  
	  
	  System.out.println(repo.findCourseById(3));
	  
	  repo.deleteById(5);

	}

}
