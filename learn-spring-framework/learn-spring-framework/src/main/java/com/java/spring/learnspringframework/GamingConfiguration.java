package com.java.spring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.spring.learnspringframework.game.GameConsole;
import com.java.spring.learnspringframework.game.GameRunner;
import com.java.spring.learnspringframework.game.PacMan;

@Configuration
public class GamingConfiguration {

	
	@Bean
	public GameConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
//	//var game = new MarioGame();
//	var game = new PacMan();
//	//var game = new SuperContra();
//	var gameRunner = new GameRunner(game);
//	gameRunner.run();
}
