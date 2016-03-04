package edu.neumont.csc150.FinalProject.andersonb;

import java.util.Random;

import greenfoot.GreenfootImage;
import greenfoot.World;
import greenfoot.collision.*;
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
	protected int randomY = rand.nextInt(200) + 300;
	private GreenfootImage background = new GreenfootImage("Obsticles/Back.jpg");
CollisionChecker col;

	public Levels() {
		super(800, 600, 1, false);
		setBackground(background);
		score = new Score(this, 50, 25);
		lives = new Lives(this, 750, 25);
		coin = new Coin(this, 1000, randomY - 50);
	}

	public void act() {	
		}
		

	public Score getScore() {
		return score;
	}

	public Lives getLives() {
		return lives;
	}
}