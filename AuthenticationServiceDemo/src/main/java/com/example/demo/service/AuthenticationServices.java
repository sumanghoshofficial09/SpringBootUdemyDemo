package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServices {
	
	public boolean authenticate(String name , String password)
	{
		  return name.equalsIgnoreCase("suman") && password.equalsIgnoreCase("pwd");
	}

}
