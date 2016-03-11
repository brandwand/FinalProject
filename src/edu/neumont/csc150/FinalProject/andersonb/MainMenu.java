package edu.neumont.csc150.FinalProject.andersonb;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class MainMenu extends World {
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	private Random rand = new Random();
	private GreenfootImage background;
	private Score score;
	private HighScore h;
	private ScoreLogger scoreLogger;

	
	public MainMenu() {
		super(800, 600, 1, false);
		background = new GreenfootImage("Obsticles/Home.png");
		setBackground(background);
		h = new HighScore(100, 100);
		addObject(h, WIDTH / 2, 200);
	}

	public void act() {
		if (Greenfoot.mousePressed(this)) {
			Greenfoot.setWorld(new Levels());
		}
	}
	public void readScore() {
		try {
			FileReader fr = new FileReader("C:\\Users\\Brandon\\OOP\\FinalProject\\HighScore.txt");
			fr.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}