package edu.neumont.csc150.FinalProject.andersonb;

import greenfoot.GreenfootImage;
import greenfoot.World;

import java.awt.Color;
import java.util.Random;

import greenfoot.Actor;

public class Obsticle extends Actor {
	private double x, y;
	private GreenfootImage i;
	private GreenfootImage image;
	private GreenfootImage images[] = new GreenfootImage[14];
	Random rand = new Random();

	public Obsticle(World w, double x, double y) {
		image = new GreenfootImage(600, 400);
		i = new GreenfootImage("Obsticle" + rand.nextInt(14) + ".png");
		image.drawImage(i, 0, 0);
		image.rotate(rand.nextInt(360));
		setImage(image);
		w.addObject(this, (int) x, (int) y);
		this.x = x;
		this.y = y;
	}

	public void act() {
		x -= 3;
		setLocation((int) x, (int) y);

	}
}
