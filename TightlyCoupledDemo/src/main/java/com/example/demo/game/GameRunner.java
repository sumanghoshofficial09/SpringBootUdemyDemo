package com.example.demo.game;

public class GameRunner {
	
	SuperContraGame  superContraGame;

	public GameRunner(SuperContraGame superContraGame) {
		this.superContraGame=superContraGame;
	}

	public void run() {
		System.out.println("Running the game "+superContraGame);
		superContraGame.up();
		superContraGame.down();
		superContraGame.left();
		superContraGame.right();
		
	}

}
