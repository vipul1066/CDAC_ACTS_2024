package com.cdac.acts;
import java.io.File;
public class PrintDir {
	public static void main(String[] args) {
		
		File file = new File("C:/Users/dac.STUDENTSDC/Downloads/Project 2");
		
		if(file.isDirectory()) {
			String[] strFiles = file.list();
			
			if(strFiles != null) {
				for( String strFile : strFiles) {
					System.out.println(strFile);
				}
			}
			else {
				System.out.println("File is Empty");
			}
		}
		else {
			System.out.println("File Not Found");
		}
		
	}

}
