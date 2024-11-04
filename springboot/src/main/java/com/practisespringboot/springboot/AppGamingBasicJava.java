package com.practisespringboot.springboot;

import com.practisespringboot.springboot.game.gameRunner;
import com.practisespringboot.springboot.game.marioGame;
import com.practisespringboot.springboot.game.pacMan;
import com.practisespringboot.springboot.game.superContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		var game = new marioGame();
//		var game = new superContraGame(); 
		var game = new pacMan();
		var gameRunner = new gameRunner(game);
		gameRunner.run();
	}

}
