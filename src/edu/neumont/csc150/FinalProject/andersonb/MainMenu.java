package edu.neumont.csc150.FinalProject.andersonb;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class MainMenu extends World {
	private static final Integer WIDTH = 800;
	private static final Integer HEIGHT = 600;
	private GreenfootImage background;
	private HighScore h;

	
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
}