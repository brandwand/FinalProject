package edu.neumont.csc150.FinalProject.andersonb;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class HighScore  extends Actor implements ScoreLogger {
	Color c;
	double x, y;
	private FileReader fileReader;
	private File file;
	private BufferedReader buff;
	private String readFile;
	public HighScore(double x, double y) {
		this.x = x;
		this.y = y;
		try {
			fileReader = new FileReader(new File("HighScore.txt"));
		BufferedReader buff = new BufferedReader(fileReader);
		readFile = buff.readLine();
		c = new Color(0, 0, 0, 0);
			setImage(new GreenfootImage(readFile, 50, Color.BLACK, c));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setLocation((int) x, (int) y);

	}
	
	public void writingToFile(String write) {
		file = new File("HighScore.txt");
		try {
			if(file.exists()) {
			file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			fw.write(write);
			fw.close();
		} catch (IOException e) {		
			System.out.println("IOException");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void recordScore(int i) {
		int r = Integer.parseInt(readFile.substring(12, readFile.length()));
		if(i >= r){
			r = i;
		}
		writingToFile("High Score: " + r);
		
	}
}
