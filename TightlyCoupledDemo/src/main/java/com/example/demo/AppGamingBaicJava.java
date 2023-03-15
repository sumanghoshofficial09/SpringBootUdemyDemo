package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;

public class AppGamingBaicJava {

	public static void main(String[] args) {
		
		var superContraGame = new SuperContraGame();
		
		//var marioGame = new MarioGame();
		var gameRunner= new GameRunner(superContraGame);
		gameRunner.run();

	}

}
