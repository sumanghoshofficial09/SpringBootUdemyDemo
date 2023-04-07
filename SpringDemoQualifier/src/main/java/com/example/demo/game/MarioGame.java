package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	
	public void up()
	{
		System.out.println("Jump");
	}

	public void down()
	{
		System.out.println("Go to hole");
	}
	
	public void left()
	{
		System.out.println("go  back");
	}
	
	public void right()
	{
		System.out.println("Accelerate");
	}

}
