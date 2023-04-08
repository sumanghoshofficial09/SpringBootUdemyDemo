package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.configurationprop.CourseConfigurationProperties;

@SpringBootApplication

@EnableConfigurationProperties(CourseConfigurationProperties.class)
public class WorkingWithConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkingWithConfigurationPropertiesApplication.class, args);
	}

}
