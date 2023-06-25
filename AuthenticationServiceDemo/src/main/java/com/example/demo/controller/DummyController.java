package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {
	
	
	@RequestMapping("/dummy")
	public String dummy()
	{
		return "dummy";
		
	}

}
