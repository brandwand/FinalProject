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
		System.out.println(velY);
		gravity();
		bouncingOffTheTop();
		moveRight();
		moveLeft();
		bounceHigher();
		isMovingDownTrue();
		stayingInScreen();
		setLocation((int) x, (int) y);
	}

	public void gravity() {
		if (velY != 0) {
			velY += accel;
			y += velY;
		} else {
			velY = -2;
			Collision();
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
			velY -= 20;
		}
	}

	public void isMovingDownTrue() {
		if (velY > 0) {
			isMovingDown = true;
		} else {
			isMovingDown = false;
		}

	}

	public void Collision() {
		if (isTouching(SimpleShape.class) && time == 4) {
			velY *= -.96;
			time = 0;
		}
	}

	public void stayingInScreen() {
		if (x < 10) {
			x = 10;
		}
		if (x > 790) {
			x = 790;
		}
		if (y > 590) {
			if (isMovingDown) {
				velY *= -.96;
			}
			if (velY > -.9 && velY < .9) {
				velY = 0;
			}
		}
		if (isTouching(SimpleShape.class)) {
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