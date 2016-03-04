package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.Random;


public class Platform extends Actor {

	private double x, y;
	private int time = 0;
	private GreenfootImage i;
	public Platform(World w, double x, double y) {
		i = new GreenfootImage(800, 25);
		i.fillRect(0, 0, 800, 25);
		setImage(i);
		this.x = x;
		this.y = y;
		w.addObject(this, (int) x, (int) y);
	}
	
	public void act() {	
		time++;
		if(time >= 175) {
		y += 3;
		}
		setLocation((int) x, (int) y);
	}
}