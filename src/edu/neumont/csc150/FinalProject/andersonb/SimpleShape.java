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

	public SimpleShape(World w, double x, double y, BallColors b) {
		
		this.b = b;
		i = new GreenfootImage(300, 25);
		b.drawColor(i);
		i.fillRect(0, 0, 300, 25);
		setImage(i);
		this.x = x;
		this.y = y;
		w.addObject(this, (int) x, (int) y);
	}
	
	public void act() {
		x -= 3;
		setLocation((int) x, (int) y);

	}
}