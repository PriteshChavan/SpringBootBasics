package com.java.spring.learnspringframework;

import com.java.spring.learnspringframework.game.GameRunner;
import com.java.spring.learnspringframework.game.MarioGame;
import com.java.spring.learnspringframework.game.PacMan;
import com.java.spring.learnspringframework.game.SuperContra;

public class App001GamingBasic {
		public static void main(String[] args) {
			
			//var game = new MarioGame();
			var game = new PacMan();
			//var game = new SuperContra();
			var gameRunner = new GameRunner(game);
			gameRunner.run();
		}
}
