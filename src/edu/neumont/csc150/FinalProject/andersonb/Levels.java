package edu.neumont.csc150.FinalProject.andersonb;
import java.util.Random;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Levels extends World {
	Random rand = new Random();
	private SimpleShape shape;
	private Score score;
	private Lives lives;
	private int time = 0;
	private Coin coin;
	private Platform platform;
	private boolean spawnCoin;
	private FirstLevelBall b;
	private SecondLevelBall sb;
	private boolean whichBall = rand.nextBoolean();
	private int randomY = rand.nextInt(200) + 300;
	private GreenfootImage background;
	private HighScore h;

	public Levels() {
		super(800, 600, 1, false);
		background = new GreenfootImage("Obsticles/Back.jpg");
		setBackground(background);
		h = new HighScore(100, 100);
		score = new Score(175, 80, h);
		addObject(score, 175 , 80);	
		lives = new Lives(this, 615, 80);
		platform = new Platform(400, 400);
		addObject(platform, 400, 400);

		if (whichBall) {
			b = new FirstLevelBall(25, 300, BallColors.getColor());
			addObject(b, 25, 300);
		} else {
			sb = new SecondLevelBall(25, 300, BallColors.getColor());
			addObject(sb, 25, 300);

		}
	}

	public void act() {
		time++;
		if (time == 75) {
			spawnCoin = rand.nextBoolean();
			randomY = rand.nextInt(450) + 175;
			
			/*
			 The Below Code is how the platforms are set up.
			  The second set of if else statements are 
			 for showing purposes in project showcase.
			 */
//			if (score.getScore() >= 25 && score.getScore() < 50) {
//				shape = new SimpleShape(randomY, -100, BallColors.RED, ShapeSize.First, 300, 2, 3);
//				addObject(shape, randomY, -100);
//			} else if (score.getScore() >= 50 && score.getScore() < 75) {
//				shape = new SimpleShape(randomY, -100, BallColors.GREEN, ShapeSize.Second, 225, 0, 4);
//				addObject(shape, randomY, -100);
//			} else if (score.getScore() >= 75 && score.getScore() < 100) {
//				shape = new SimpleShape(randomY, -100, BallColors.GRAY, ShapeSize.Second, 225, 2, 4);
//				addObject(shape, randomY, -100);
//			} else if (score.getScore() >= 100 && score.getScore() < 125) {
//				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 150, 0, 4);
//				addObject(shape, randomY, -100);
//			} else if (score.getScore() >= 125 && score.getScore() < 150) {
//				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 150, 2, 4);
//				addObject(shape, randomY, -100);
//			} else if (score.getScore() >= 150) {
//				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 100, 1, 5);
//				addObject(shape, randomY, -100);
//			} else {
//				shape = new SimpleShape(randomY, -100, BallColors.MAGENTA, ShapeSize.First, 300, 0, 3);
//				addObject(shape, randomY, -100);
//			}
			
			//This is the code used for project showcase.
			if (score.getScore() >= 5 && score.getScore() < 10) {
				shape = new SimpleShape(randomY, -100, BallColors.RED, ShapeSize.First, 300, 2, 3);
				addObject(shape, randomY, -100);
			} else if (score.getScore() >= 10 && score.getScore() < 15) {
				shape = new SimpleShape(randomY, -100, BallColors.GREEN, ShapeSize.Second, 225, 0, 4);
				addObject(shape, randomY, -100);
			} else if (score.getScore() >= 15 && score.getScore() < 20) {
				shape = new SimpleShape(randomY, -100, BallColors.GRAY, ShapeSize.Second, 225, 2, 4);
				addObject(shape, randomY, -100);
			} else if (score.getScore() >= 20 && score.getScore() < 25) {
				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 150, 0, 4);
				addObject(shape, randomY, -100);
			} else if (score.getScore() >= 25 && score.getScore() < 30 ) {
				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 150, 2, 4);
				addObject(shape, randomY, -100);
			} else if (score.getScore() >= 30 && score.getScore() < 35 ) {
				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 100, 1, 5);
				addObject(shape, randomY, -100);
			} else if (score.getScore() >= 35) {
				shape = new SimpleShape(randomY, -100, BallColors.getColor(), ShapeSize.Third, 75, 2, 5);
				addObject(shape, randomY, -100);
			} else {
				shape = new SimpleShape(randomY, -100, BallColors.MAGENTA, ShapeSize.First, 300, 0, 3);
				addObject(shape, randomY, -100);
			}
			if (spawnCoin) {
				coin = new Coin(randomY, -150);
				addObject(coin, 1000, randomY - 50);
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