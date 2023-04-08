package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Course;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	List<Course> getCourse()
	{
		return Arrays.asList(new Course(1, "gcp", "suman"),new Course(0, "aws", "modi"),new Course(0, "azure", "puja"));
	}

}
