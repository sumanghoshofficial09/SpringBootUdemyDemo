package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;
import com.example.demo.game.SuperContraGame;

public class App01GamingBaicJava {

	public static void main(String[] args) {
		
		//var game = new SuperContraGame();
		
		var game = new PacMan();
		var gameRunner= new GameRunner(game);//  we are here wiring of dependencies 
		gameRunner.run();

	}

}
