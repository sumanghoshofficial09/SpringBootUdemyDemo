package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;

@Configuration
public class HelloWorldConfiguration {
	
	
	@Bean
	public MarioGame mario()
	{
		return new MarioGame();
	}
	
	
	@Bean
	public PacMan pacman()
	{
		return new PacMan();
	}
	
	
	@Bean
	public GamingConsole gamingConsole()
	{
		return pacman();
	}
	
	@Bean
	public GameRunner gameRunner()
	{
		return new GameRunner(gamingConsole());
	}
	

}
