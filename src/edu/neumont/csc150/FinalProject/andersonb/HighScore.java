package edu.neumont.csc150.FinalProject.andersonb;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HighScore implements ScoreLogger {

	public HighScore() {
	}
	
	public void writingToFile(String write) {
		File file = new File("HighScore.txt");
		try {
			if(file.exists()) {
			file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			fw.write(write);
			fw.flush();
			fw.close();
		} catch (IOException e) {		
			System.out.println("IOException");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void recordScore(int i) {
		writingToFile("Score: " + i);
	}
}
