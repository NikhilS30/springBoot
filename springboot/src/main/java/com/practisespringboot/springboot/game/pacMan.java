package com.practisespringboot.springboot.game;

public class pacMan implements gamingConsole{
	
	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("slip");
	}

	public void left() {
		System.out.println("kick");
	}

	public void right() {
		System.out.println("shoot");
	}

}
