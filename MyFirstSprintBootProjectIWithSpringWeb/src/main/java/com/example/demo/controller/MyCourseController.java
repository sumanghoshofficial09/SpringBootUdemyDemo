package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Course;

@RestController
public class MyCourseController {
	
	
	@RequestMapping("/courses")
	List<Course> getAllCourses()
	{
		return Arrays.asList(new Course(1, "GCP", "suman"),new Course(2, "AWS", "ghosh"));
		
	}

}
