package edu.neumont.csc150.FinalProject.andersonb;
import greenfoot.GreenfootImage;
import java.util.Random;

public class FirstLevelBall extends Ball {

	private GreenfootImage i;
	private BallColors b;
	private Random rand = new Random();
	private double x, y;

	public FirstLevelBall(double x, double y, BallColors b) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.b = b;
		i = new GreenfootImage(25, 25);
		b.drawColor(i);
		i.fillOval(0, 0, 25, 25);
		setImage(i);
	}
}
