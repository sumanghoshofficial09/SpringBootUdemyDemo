package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;
import com.example.demo.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		/**
		 * launch a spring context and configure the things that you want spring to manage : some thing we need COnfiguration class 
		 * 
		 * we can use configuration class to launch a spring context 
		 * 
		 * 
		 */
		// creating a spring context ;
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// Retreiving beans managed by spring 
		String myname = (String) context.getBean("name");
		
		System.out.println("What is my name "+myname);
		
		
		
		
	}

}
