package com.tech.spring_framework_in10steps.game;

public class GameRunner {
	
	//private MarioGame game;
	
	//private SuperContraGame scGame;
	
	//now, we can use the interface that will work for both the games and you can choose any one game on Main class
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game=game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	

}
