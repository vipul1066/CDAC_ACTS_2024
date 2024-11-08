package com.cdac.acts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
	public static void main(String[] args) {
		
		String filepath = "C:/Users/dac.STUDENTSDC/Documents/abc.txt";
		
		
		try(BufferedReader bufferReader = new BufferedReader(new FileReader(filepath))) {
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
