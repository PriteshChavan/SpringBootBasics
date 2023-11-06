package com.java.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.spring.learnspringframework.game.GameConsole;
import com.java.spring.learnspringframework.game.GameRunner;
import com.java.spring.learnspringframework.game.MarioGame;
import com.java.spring.learnspringframework.game.PacMan;
import com.java.spring.learnspringframework.game.SuperContra;

public class App003GamingSpringBeans {
		public static void main(String[] args) {
			
			try(var context = new  AnnotationConfigApplicationContext(GamingConfiguration.class)) {
				
				context.getBean(GameConsole.class).up();
				context.getBean(GameRunner.class).run();
//				//var game = new MarioGame();
//				var game = new PacMan();
//				//var game = new SuperContra();
//				var gameRunner = new GameRunner(game);
//				gameRunner.run();
			}
			
			
		}
}
