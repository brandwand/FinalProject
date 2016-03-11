package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;
import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Score extends Actor {
	private int score = 0;
	private double x, y;
	private ScoreLogger scoreLogger;
	private Color c;

	public Score(double x, double y, ScoreLogger scoreLogger) {
		
		this.x = x;
		this.y = y;
		this.scoreLogger  = scoreLogger;
	}

	public void act() {
		c = new Color(0, 0, 0, 0);
		setImage(new GreenfootImage("Score: " + score, 50, Color.ORANGE, c));
		setLocation((int) x, (int) y);
	}

	public void addScore() {
		score++;
		scoreLogger.recordScore(score);
	}

	public void subtractScore() {
		score--;
	}

	public int getScore() {
		return score;
	}
}