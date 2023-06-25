package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class TestController {
	
	
	@RequestMapping("/hello")
	public String getHello()
	{
		return "My String is hello";
	}

}
