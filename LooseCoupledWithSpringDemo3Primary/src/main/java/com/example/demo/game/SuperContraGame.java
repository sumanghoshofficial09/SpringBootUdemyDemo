package com.example.demo.game;

public class SuperContraGame implements GamingConsole {
	@Override
	public void up()
	{
		System.out.println("in the sky");
	}

	@Override
	public void down()
	{
		System.out.println("down");
	}
	
	@Override
	public void left()
	{
		System.out.println("go back  superContra");
	}
	
	@Override
	public void right()
	{
		System.out.println("shoot a bullet");
	}

}
