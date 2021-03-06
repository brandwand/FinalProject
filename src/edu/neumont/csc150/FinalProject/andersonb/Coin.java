package edu.neumont.csc150.FinalProject.andersonb;
import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Coin extends Actor {

	private GreenfootImage ball = new GreenfootImage("Obsticles/coin.png");
	int time = 0;
	private double x;
	private double y;
	
	public Coin(double x, double y) {
		this.x = x;
		this.y = y;

		GreenfootImage image = new GreenfootImage(435, 480);
		image.drawImage(ball, 0, 0);
		image.scale(70, 70);
		setImage(image);

	}

	public void act() {
		y += 3;
		if (x == 0) {
			getWorld().removeObject(this);
		}

		setLocation((int) x, (int) y);

	}
}
