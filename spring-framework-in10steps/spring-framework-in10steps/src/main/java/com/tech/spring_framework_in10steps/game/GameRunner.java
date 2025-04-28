package com.tech.spring_framework_in10steps.game;

public class GameRunner {
	
	//private MarioGame game;
	
	private SuperContraGame scGame;

	public GameRunner(SuperContraGame scGame) {
		this.scGame=scGame;
	}

	public void run() {
		scGame.up();
		scGame.down();
		scGame.left();
		scGame.right();
	}
	

}
