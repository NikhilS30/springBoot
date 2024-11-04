package com.practisespringboot.springboot.game;

public class gameRunner {
	
//	marioGame game;

//	public gameRunner(marioGame game) {
//		this.game=game;
//	}
	
	gamingConsole game;
	
	public gameRunner(gamingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("running game :"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
