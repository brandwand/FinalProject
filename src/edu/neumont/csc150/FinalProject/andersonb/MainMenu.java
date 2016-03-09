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
	Random rand = new Random();
	private GreenfootImage background = new GreenfootImage("Obsticles/Home.png");
	private Score score;
	private HighScore h;

	
	public MainMenu() {
		super(800, 600, 1, false);
		setBackground(background);
		h = new HighScore();
		readScore();	
	}

	public void act() {
		if (Greenfoot.mousePressed(this)) {
			Greenfoot.setWorld(new Levels());
		}
	}
}