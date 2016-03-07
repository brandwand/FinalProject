package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Lives extends Actor {
	private int lives = 3;
	private double x;
	private double y;

	public Lives(World world, double x, double y) {
		world.addObject(this, (int) x, (int) y);
		this.x = x;
		this.y = y;
	}

	public void act() {
		Color c = new Color(0, 0, 0, 0);
		setImage(new GreenfootImage("Lives: " + lives, 50, Color.ORANGE, c));
		setLocation((int) x, (int) y);
		if(lives == 0) {
			Greenfoot.setWorld(new MainMenu());
		}
	}

	public void addLives() {
		lives++;
	}

	public void subtractLives() {
		lives--;
	}
	
	public int getLives() {
		return lives;
	}
}