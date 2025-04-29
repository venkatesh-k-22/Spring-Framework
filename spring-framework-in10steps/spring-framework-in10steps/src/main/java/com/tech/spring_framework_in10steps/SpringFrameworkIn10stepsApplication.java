package com.tech.spring_framework_in10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tech.spring_framework_in10steps.game.GameRunner;
import com.tech.spring_framework_in10steps.game.MarioGame;
import com.tech.spring_framework_in10steps.game.SuperContraGame;

@SpringBootApplication
public class SpringFrameworkIn10stepsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkIn10stepsApplication.class, args);
	
		//you can use either MarioGame or ContraGame
		MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
