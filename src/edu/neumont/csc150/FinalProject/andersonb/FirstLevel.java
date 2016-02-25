package edu.neumont.csc150.FinalProject.andersonb;

import java.util.Random;

import greenfoot.GreenfootImage;
import greenfoot.World;

public class FirstLevel extends Levels {
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	private FirstLevelBall b;
	private SecondLevelBall sb;
	private SimpleShape ss;
	private Score score;
	Random rand = new Random();
	public FirstLevel() {
		super();
		 b = new FirstLevelBall(this, 25, 300, BallColors.getColor());
		 }

	@Override
	public void act() {
	
	}
}