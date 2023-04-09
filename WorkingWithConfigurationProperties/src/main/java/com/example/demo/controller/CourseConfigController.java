package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configurationprop.CourseConfigurationProperties;

@RestController
public class CourseConfigController {
	
	
	CourseConfigurationProperties  props;
	
	
	@RequestMapping("/courseconfig")
	public CourseConfigurationProperties  getCourseConfig()
	{
		System.out.println(props);
		return props;
	}
	
	
	
	
	  public CourseConfigController(CourseConfigurationProperties props) { super();
	  this.props = props; }
	  
	 
	
	

}
