package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.Random;

public class SimpleShape extends Actor {

	private double x, y;
	private GreenfootImage i;
	private Random rand = new Random();
	private BallColors b;
	private ShapeSize s;
	private boolean isXMovingLeft = rand.nextBoolean();
	private boolean isXMovingRight = rand.nextBoolean();
	private int changeX = 0;
	private int changeY = 0;

	public SimpleShape(double x, double y, BallColors b, ShapeSize s, int length, int changeX, int changeY) {
		this.b = b;
		this.s = s;
		this.changeX = changeX;
		this.changeY = changeY;
		i = new GreenfootImage(length, 25);
		b.drawColor(i);
		s.drawSize(i);

		setImage(i);
		this.x = x;
		this.y = y;
	}

	public void act() {
		y += changeY;
		if (x > 175 && x < 625) {
			if (isXMovingLeft) {
				x -= changeX;
			} else if (isXMovingRight) {
				x += changeX;
			}
		}
		setLocation((int) x, (int) y);
	}
}