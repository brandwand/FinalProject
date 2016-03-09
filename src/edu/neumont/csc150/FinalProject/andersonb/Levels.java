package edu.neumont.csc150.FinalProject.andersonb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Levels extends World {
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	Random rand = new Random();
	protected SimpleShape shape;
	protected Score score;
	protected Lives lives;
	protected int time = 0;
	protected Coin coin;
	protected Platform platform;
	private boolean spawnCoin;
	private FirstLevelBall b;
	private SecondLevelBall sb;
	private boolean whichBall = rand.nextBoolean();
	protected int randomY = rand.nextInt(200) + 300;
	private GreenfootImage background = new GreenfootImage("Obsticles/Back.jpg");
	private HighScore h;

	public Levels() {
		super(800, 600, 1, false);
		setBackground(background);
		h = new HighScore();
		score = new Score(175, 80, h);
		addObject(score, 175 , 80);	
		lives = new Lives(this, 615, 80);
		coin = new Coin(this, 1000, randomY - 50);
		platform = new Platform(this, 400, 400);
		if (whichBall) {
			b = new FirstLevelBall(this, 25, 300, BallColors.getColor());
		} else {
			sb = new SecondLevelBall(this, 25, 300, BallColors.getColor());
		}
	}

	public void act() {
		time++;
		if (time == 75) {
			spawnCoin = rand.nextBoolean();
			randomY = rand.nextInt(450) + 175;
			if (score.getScore() >= 25 && score.getScore() < 50) {
				shape = new SimpleShape(this, randomY, -100, BallColors.RED, ShapeSize.First, 300, 2, 3);
			} else if (score.getScore() >= 50 && score.getScore() < 75) {
				shape = new SimpleShape(this, randomY, -100, BallColors.GREEN, ShapeSize.Second, 225, 0, 4);
			} else if (score.getScore() >= 75 && score.getScore() < 100) {
				shape = new SimpleShape(this, randomY, -100, BallColors.GRAY, ShapeSize.Second, 225, 2, 4);
			} else if (score.getScore() >= 100 && score.getScore() < 125) {
				shape = new SimpleShape(this, randomY, -100, BallColors.getColor(), ShapeSize.Third, 150, 0, 4);
			} else if (score.getScore() >= 125 && score.getScore() < 150) {
				shape = new SimpleShape(this, randomY, -100, BallColors.getColor(), ShapeSize.Third, 150, 2, 4);
			} else {
				shape = new SimpleShape(this, randomY, -100, BallColors.MAGENTA, ShapeSize.First, 300, 0, 3);

			}
			if (spawnCoin) {
				coin = new Coin(this, randomY, -150);
			}
			time = 0;
		}
	}

	public Score getScore() {
		return score;
	}

	public Lives getLives() {
		return lives;
	}
}