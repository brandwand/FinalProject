package edu.neumont.csc150.FinalProject.andersonb;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Ball extends Actor {
	private double x, y;
	private double velY = 1.2;
	private double accel = 1.6;
	private boolean isMovingDown;
	private int numberOfJumps = 2;

	public Ball(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		
	}

	public void act() {
		turn(10);
		gravity();
		bounceHigher();
		touchedGround();
		touchedCoin();
		bouncingOffTheTop();
		moveRight();
		moveLeft();
		isMovingDownTrue();
		stayingInScreen();
		setLocation((int) x, (int) y);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void touchedCoin() {
		if (isTouching(Coin.class)) {
			Levels level = (Levels) getWorld();
			Score score = level.getScore();
			score.addScore();
			removeTouching(Coin.class);
		}
	}

	public void touchedGround() {
		if (y > 585) {
			Levels level = (Levels) getWorld();
			Lives lives = level.getLives();
			lives.subtractLives();
			numberOfJumps = 2;
		}
	}

	public void gravity() {
		if (velY != 0) {
			velY += accel;
			y += velY;
		} else {
			velY = -2;
		}
	}

	public void moveRight() {
		if (Greenfoot.isKeyDown("d")) {
			x += 6;
		}
	}

	public void moveLeft() {
		if (Greenfoot.isKeyDown("a")) {
			x -= 6;
		}
	}

	public void bounceHigher() {
		if (Greenfoot.mousePressed(null)) {
			if (numberOfJumps > 0) {
				numberOfJumps--;
				velY = -25;
			}
		}
	}

	public void isMovingDownTrue() {
		if (velY > 0) {
			isMovingDown = true;
		} else {
			isMovingDown = false;
		}

	}

	public void stayingInScreen() {
		if (x < 15) {
			x = 785;
		}
		if (x > 785) {
			x = 10;
		}
		if (y > 585) {
			if (isMovingDown) {
				velY *= -.96;
			}
			if (velY > -.9 && velY < .9) {
				velY = 0;
			}
		}
		if (isTouching(SimpleShape.class) || isTouching(Platform.class)) {
			numberOfJumps = 2;
			if (isMovingDown) {
				velY *= -.96;
			}
			if (velY > -.9 && velY < .9) {
				velY = 0;
			}
		}

	}

	public void bouncingOffTheTop() {
		if (y < 10) {
			if (velY < 0) {
				velY *= -.5;
			}
		}
	}
}