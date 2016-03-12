package edu.neumont.csc150.FinalProject.andersonb;
import greenfoot.GreenfootImage;

public class SecondLevelBall extends Ball {

	private GreenfootImage i;
	private BallColors b;
	private double x, y;

	public SecondLevelBall(double x, double y, BallColors b) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.b = b;
		i = new GreenfootImage(25, 25);
		b.drawColor(i);
		i.fillRect(0, 0, 25, 25);
		setImage(i);
	}
}
