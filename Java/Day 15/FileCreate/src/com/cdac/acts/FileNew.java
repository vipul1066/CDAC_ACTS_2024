package com.cdac.acts;
import java.io.File;
import java.io.IOException;
public class FileNew {
	public static void main(String[] args) {
		
		File file = new File("C:/Users/dac.STUDENTSDC/Documents/abc.txt");
		if(file.exists()) {
			System.out.println("File is already exist at " + file.getPath());
		}
		else {
			Boolean newFile;
			try {
				newFile = file.createNewFile();
				if(newFile) {
					System.out.println("File created successfully!! at " + file.getPath());
				}
				else {
					System.out.println("An error occured");
				}
			} catch (IOException e) {
				System.out.println("Error in file creation");
				e.printStackTrace();
			}
			
		}
	}

}
