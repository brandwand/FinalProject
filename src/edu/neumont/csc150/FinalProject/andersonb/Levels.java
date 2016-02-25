package edu.neumont.csc150.FinalProject.andersonb;

import java.util.Random;

import greenfoot.GreenfootImage;
import greenfoot.World;

public class Levels extends World {
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	Random rand = new Random();
	SimpleShape shape;
	Score score;
	protected int time = 0;

	public Levels() {
		super(800, 600, 1, false);
		score = new Score(this, 50, 25);
		shape = new SimpleShape(this, 1000, rand.nextInt(200) + 300, BallColors.getColor());
	}
}