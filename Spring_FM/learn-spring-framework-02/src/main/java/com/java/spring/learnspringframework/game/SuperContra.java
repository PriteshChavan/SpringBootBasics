package com.java.spring.learnspringframework.game;

public class SuperContra implements GameConsole{
	public void up() {
		System.out.println("JUMP");
	}
		
	public void down() {
				System.out.println("SIT");
			}
	public void left() {
			System.out.println("LEFT");
	}
	public void right() {
		System.out.println("RIGHT");
	}
}
