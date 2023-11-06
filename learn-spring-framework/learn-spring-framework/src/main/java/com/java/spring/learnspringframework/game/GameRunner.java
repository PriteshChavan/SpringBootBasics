package com.java.spring.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;
	//SuperContra game;
	private GameConsole game;
	public GameRunner(GameConsole game) {
		this.game =game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game:+ "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
