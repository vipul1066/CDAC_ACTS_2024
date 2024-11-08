package com.cdac.acts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Readwritefile {
	public static void main(String[] args) {
	
		String readfile = "C:/Users/dac.STUDENTSDC/Documents/abc.txt";
		String writefile = "C:/Users/dac.STUDENTSDC/Documents/desti.txt";
		
		try( BufferedReader bufferedreader = new BufferedReader( new FileReader(readfile));
			 BufferedWriter bufferedwriter = new BufferedWriter( new PrintWriter(new FileWriter(writefile))))	
			{
			String line;
			while((line = bufferedreader.readLine()) != null ) {
				bufferedwriter.write(line);
				bufferedwriter.newLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
}

}
