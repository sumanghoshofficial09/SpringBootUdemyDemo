package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping("hello")
	@ResponseBody
	public String helloWorld()
	{
		
		return "Hello World , what are you learning today!";
	}

}
