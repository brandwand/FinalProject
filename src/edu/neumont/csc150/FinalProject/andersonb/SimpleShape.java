package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.Random;

public class SimpleShape extends Actor {

	private double x, y;
	private GreenfootImage i;
	Random rand = new Random();
	BallColors b;
	ShapeSize s;
	private boolean isXMovingLeft = rand.nextBoolean();
	private boolean isXMovingRight = rand.nextBoolean();
	private int changeX = 0;
	private int changeY = 0;
/**
 * 
 * @param w
 * @param x
 * @param y
 * @param b
 * @param s
 * @param length
 * @param changeX
 * @param changeY
 */
	public SimpleShape(World w, double x, double y, BallColors b, ShapeSize s, int length, int changeX, int changeY) {
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
		w.addObject(this, (int) x, (int) y);
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