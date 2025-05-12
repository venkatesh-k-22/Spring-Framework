package com.tech.spring_framework_in10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tech.spring_framework_in10steps.game.GameRunner;
import com.tech.spring_framework_in10steps.game.GamingConsole;
import com.tech.spring_framework_in10steps.game.MarioGame;
import com.tech.spring_framework_in10steps.game.Pacman;
import com.tech.spring_framework_in10steps.game.SuperContraGame;

@SpringBootApplication
public class SpringFrameworkIn10stepsApplication {

	public static void main(String[] args) {
		
	
		//you can use either MarioGame or ContraGame
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GamingConsole game = new Pacman(); //Upcasting  //1
		//GameRunner gameRunner = new GameRunner(game); //2 these 2 instances needs to create spring framework
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkIn10stepsApplication.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}

}
