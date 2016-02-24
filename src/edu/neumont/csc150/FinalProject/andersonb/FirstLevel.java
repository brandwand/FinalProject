package edu.neumont.csc150.FinalProject.andersonb;

import java.util.Random;

import greenfoot.GreenfootImage;
import greenfoot.World;

public class FirstLevel extends World {
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	private FirstLevelBall b;
	private SecondLevelBall sb;
	private SimpleShape ss;
	private int timer = 0;

	public FirstLevel() {
		super(800, 600, 1, false);
		 b = new FirstLevelBall(this, 25, 300, BallColors.getColor());
//		sb = new SecondLevelBall(this, 25, 300, BallColors.getColor());
	}

	@Override
	public void act() {
		timer++;
		if (timer == 150) {
//			ss = new SimpleShape(this, 1000, 500, BallColors.getColor());
			timer = 0;
		}
	}
}