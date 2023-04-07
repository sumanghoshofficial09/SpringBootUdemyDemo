package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configuration.HelloWorldConfiguration;
import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;
import com.example.demo.game.SuperContraGame;

public class AppGamingBaicJava {

	public static void main(String[] args) {
		
		//var game = new SuperContraGame();
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			context.getBean(GameRunner.class).run();
		}
		
		
		
	}

}
