package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;
import java.util.Random;

import greenfoot.GreenfootImage;

public enum ShapeSize {
	First {
		@Override
		public void drawSize(GreenfootImage image) {
			image.fillRect(0, 0, 300, 25);	
				}
	},

	Second {
		@Override
		public void drawSize(GreenfootImage image) {
			image.fillRect(0, 0, 225, 25);	
		}
	}, 

	Third {
		@Override
		public void drawSize(GreenfootImage image) {
			image.fillRect(0, 0, 150, 25);
		}

	};

	public abstract void drawSize(GreenfootImage image);
}