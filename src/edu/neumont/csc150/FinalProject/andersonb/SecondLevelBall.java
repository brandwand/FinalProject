package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;

import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.Random;

public class SecondLevelBall extends Ball {

	private GreenfootImage i;
	Random rand = new Random();
	BallColors b;

	public SecondLevelBall(World w, double x, double y, BallColors b) {
		super(w, x, y);
		this.b = b;
		i = new GreenfootImage(25, 25);
		b.drawColor(i);
		i.fillRect(0, 0, 25, 25);
		setImage(i);
	}
}
