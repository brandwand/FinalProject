package edu.neumont.csc150.FinalProject.andersonb;

import java.awt.Color;
import java.util.Random;

import greenfoot.GreenfootImage;

public enum BallColors {
	GREEN {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.GREEN);
			image.fillOval(0, 0, 15, 15);
		}
	},

	BLUE {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.BLUE);
			image.fillOval(0, 0, 15, 15);
		}
	}, 

	RED {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.RED);
		}

	},

	ORANGE {
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.ORANGE);
		};
	};

	private static Random rand = new Random();

	public static BallColors getColor() {
		int which = rand.nextInt(4);  //Four choices
		if (which == 0) {
			return GREEN;
		}else if (which == 1) {
			return BLUE;
		}else if (which == 2) {
			return ORANGE;
		}
			return RED;
		
	}
	public abstract void drawColor(GreenfootImage image);
}