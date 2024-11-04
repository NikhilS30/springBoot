package com.practisespringboot.springboot.game;

public class marioGame implements gamingConsole{

	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("slip");
	}

	public void left() {
		System.out.println("turn left");
	}

	public void right() {
		System.out.println("turn right");
	}

}
