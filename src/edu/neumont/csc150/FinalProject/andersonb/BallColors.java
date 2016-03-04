package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;
import java.util.Random;

import greenfoot.GreenfootImage;

public enum BallColors {
	GREEN {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.GREEN);
		}
	},

	MAGENTA {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.MAGENTA);
		}
	}, 

	RED {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.RED);
		}

	},

	GRAY {
		@Override
		public void drawColor(GreenfootImage image) {
			image.setColor(Color.GRAY);
		};
	};

	private static Random rand = new Random();

	public static BallColors getColor() {
		int which = rand.nextInt(4);  //Four choices
		if (which == 0) {
			return GREEN;
		}else if (which == 1) {
			return MAGENTA;
		}else if (which == 2) {
			return GRAY;
		}
			return RED;
		
	}
	public abstract void drawColor(GreenfootImage image);
}
