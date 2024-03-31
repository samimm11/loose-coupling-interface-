package com.uniq.FSDSpringProject.iteration2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface GamingConsole {
	void up();

	void down();

	void right();

	void left();
}

class Mario implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("up from mario");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("down from mario");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("right from mario");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("left from mario");
	}

}

class Contra implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("up from contra");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("down from contra");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("right from contra");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("left from contra");
	}

}

class GameRunner {
	GamingConsole obj;

	public GameRunner(GamingConsole obj) {
		this.obj = obj;

	}

	public void runGame() {
		obj.up();
		obj.down();
		obj.right();
		obj.left();
	}
}

@SpringBootApplication
public class Iteration2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Iteration2Application.class, args);
		Mario mario = new Mario();
		Contra contra = new Contra();
		GameRunner gameRunner = new GameRunner(mario);
		gameRunner.runGame();
	}

}
