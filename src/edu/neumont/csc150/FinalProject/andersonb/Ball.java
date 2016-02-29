package edu.neumont.csc150.FinalProject.andersonb;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.awt.Color;

import org.omg.Messaging.SyncScopeHelper;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Ball extends Actor {
	private double x, y;
	private double velY = 1.2;
	private double accel = 1.6;
	private boolean isMovingDown;
	private int time = 0;
	private World w;
	public Ball(World w, double x, double y) {
		super();
		w.addObject(this, (int) x, (int) y);
		this.x = x;
		this.y = y;
		this.w = w;
	}

	public void act() {
		time++;
		touchedGround();
		touchedCoin();
		gravity();
		bouncingOffTheTop();
		moveRight();
		moveLeft();
		bounceHigher();
		isMovingDownTrue();
		stayingInScreen();
		setLocation((int) x, (int) y);
	}
	
	public void touchedCoin() {
		if(isTouching(Coin.class)) {
			Levels Level =(Levels)getWorld();
			Score score = Level.getScore();
			score.addScore();
			removeTouching(Coin.class);
		}
	}
	
	public void touchedGround() {
		if(y > 590) {
			Levels Level =(Levels)getWorld();
			Lives lives = Level.getLives();
			lives.subtractLives();
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
		if (Greenfoot.mousePressed(getWorld())) {
			velY = -25;
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
				velY *= -.96;
			}
		}
	}
}