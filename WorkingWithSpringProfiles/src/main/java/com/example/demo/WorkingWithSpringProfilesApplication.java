package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.configrations.CurrencyServiceConfiguration;

@SpringBootApplication
//@EnableConfigurationProperties(CurrencyServiceConfiguration.class)
@ConfigurationPropertiesScan("com.example.demo.configrations") 
public class WorkingWithSpringProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkingWithSpringProfilesApplication.class, args);
	}

}
