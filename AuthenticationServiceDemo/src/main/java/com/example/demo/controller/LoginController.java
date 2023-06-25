package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.AuthenticationServices;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	
	@Autowired
	AuthenticationServices  service;
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String redirectToWelcome()
	{
		return "welcome";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String redirectToLogin()
	{
		return "login";
	}
	
	private   String getLoggingUserName()
	{
		
		Authentication authentication=  SecurityContextHolder.getContext().getAuthentication();
		
		return authentication.getName();
		
	}
	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String redirectToWelcome(@RequestParam  String name ,  @RequestParam String password, ModelMap model)
	{
		if(service.authenticate(name, password))
		{
		
		model.put("name", name);
		model.put("password", password);
		
		return "welcome";
		}
		else
		{
			model.put("errorMessage", "Invalid creds. login denied");
			
			return "login";
		}
	}

}
