package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {
	
	
	@RequestMapping("/login")
	public String loginPage(@RequestParam String name, ModelMap map)
	{
		map.put("name", name);
		return "login";
	}

}
