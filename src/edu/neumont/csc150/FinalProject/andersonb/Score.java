package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;
import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Score extends Actor {
	private int score = 0;
	private double x;
	private double y;

	public Score(World world, double x, double y) {
		world.addObject(this, (int) x, (int) y);
		this.x = x;
		this.y = y;
	}

	public void act() {
		Color c = new Color(0, 0, 0, 0);
		setImage(new GreenfootImage("Score: " + score, 50, Color.ORANGE, c));
		setLocation((int) x, (int) y);
	}

	public void addScore() {
		score++;
	}

	public void subtractScore() {
		score--;
	}
	
	public int getScore() {
		return score;
	}
}