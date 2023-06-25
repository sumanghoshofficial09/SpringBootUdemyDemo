package com.example.demo.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurity {
	
	
	
	@Bean
	public InMemoryUserDetailsManager  createUserDetailsManager()
	{
		
		
		
		Function<String, String> encoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails=   User.builder().passwordEncoder(encoder )
		.username("suman")
		.password("pass")
		.roles("USER","ADMIN")
		.build();
		
		
		return  new  InMemoryUserDetailsManager(userDetails);
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		
		return new BCryptPasswordEncoder();
		
	}

}
