package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {
	
	public void up()
	{
		System.out.println("Jump Packman");
	}

	public void down()
	{
		System.out.println("Go to hole Packman");
	}
	
	public void left()
	{
		System.out.println("go  back Packman");
	}
	
	public void right()
	{
		System.out.println("Accelerate Packman");
	}

}
