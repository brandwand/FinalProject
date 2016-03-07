package edu.neumont.csc150.FinalProject.andersonb;
import greenfoot.GreenfootImage;
import greenfoot.World;
import greenfoot.collision.CollisionChecker;
import greenfoot.collision.CollisionQuery;

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
	private int numberOfJumps = 2;

	public Ball(World w, double x, double y) {
		super();
		w.addObject(this, (int) x, (int) y);
		this.x = x;
		this.y = y;
		this.w = w;
	
	}

	public void act() {
		time++;
		gravity();
		bounceHigher();
		System.out.println(numberOfJumps);
		touchedGround();
		touchedCoin();
		bouncingOffTheTop();
		moveRight();
		moveLeft();
		isMovingDownTrue();
		stayingInScreen();
		setLocation((int) x, (int) y);
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