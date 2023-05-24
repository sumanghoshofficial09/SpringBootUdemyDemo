package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configrations.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigController {
	
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/config")
	public CurrencyServiceConfiguration  getCurrencyConfig()
	{
		return configuration;
	}

}
