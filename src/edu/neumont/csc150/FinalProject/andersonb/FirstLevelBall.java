package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;

import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.Random;

public class FirstLevelBall extends Ball {

	private GreenfootImage i;
	private BallColors b;
	Random rand = new Random();

	public FirstLevelBall(World w, double x, double y, BallColors b) {
		super(w, x, y);
		this.b = b;
		i = new GreenfootImage(25, 25);
		b.drawColor(i);
		i.fillOval(0, 0, 25, 25);
		setImage(i);
	}
}
