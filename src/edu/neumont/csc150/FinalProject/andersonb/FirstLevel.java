package edu.neumont.csc150.FinalProject.andersonb;
import java.util.Random;

import greenfoot.GreenfootImage;
import greenfoot.World;

public class FirstLevel extends Levels {
	Random rand = new Random();
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	private FirstLevelBall b;
	private SecondLevelBall sb;
	private boolean spawnCoin;

	
	public FirstLevel() {
		super();
		platform = new Platform(this, 400, 400);

		b = new FirstLevelBall(this, 25, 300, BallColors.getColor());
		// sb = new SecondLevelBall(this, 25, 300, BallColors.getColor());
	}

	@Override
	public void act() {
		time++;
		if (time == 75) {
			spawnCoin = rand.nextBoolean();
			randomY = rand.nextInt(450) + 175;
			if (score.getScore() >= 25 && score.getScore() < 50) {
				shape = new SimpleShape(this, randomY, -100, BallColors.RED, ShapeSize.First, 300, 2, 3);
			} /*else if (score.getScore() == 49) {
				shape = new SimpleShape(this, randomY, 50, BallColors.RED, ShapeSize.First, 300, 2, 0);
			}*/ else if (score.getScore() >= 50 && score.getScore() < 75) {
				shape = new SimpleShape(this, randomY, -100, BallColors.GREEN, ShapeSize.Second, 225, 0, 4);
			} else if (score.getScore() >= 75 && score.getScore() < 100) {
				shape = new SimpleShape(this, randomY, -100, BallColors.GRAY, ShapeSize.Second, 225, 2, 4);
			} else if (score.getScore() >= 100) {
				shape = new SimpleShape(this, randomY, -100, BallColors.getColor(), ShapeSize.Second, 225, 4, 4);
			} else {
				shape = new SimpleShape(this, randomY, -100, BallColors.MAGENTA, ShapeSize.First, 300, 0, 3);

			}
			if (spawnCoin) {
				coin = new Coin(this, randomY, -150);
			}
			time = 0;
		}
	}
}