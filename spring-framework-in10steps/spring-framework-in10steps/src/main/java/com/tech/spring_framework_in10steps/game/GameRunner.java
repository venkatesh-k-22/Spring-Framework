package com.tech.spring_framework_in10steps.game;

public class GameRunner {
	
	private MarioGame game;

	public GameRunner(MarioGame game) {
		this.game=game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	

}
