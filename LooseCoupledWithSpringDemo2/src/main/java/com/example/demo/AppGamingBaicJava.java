package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;
import com.example.demo.game.SuperContraGame;


@Configuration
@ComponentScan("com.example.demo")
public class AppGamingBaicJava {

	public static void main(String[] args) {
		
		
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGamingBaicJava.class))
		{
			context.getBean(GameRunner.class).run();
		}
		
		
		
	}

}
