package com.cdac.acts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SaveFile {
	private static  String FILE_NAME = "C:\\Users\\vipul\\Documents\\data\\printers.dat";
	
	public static void savefile(Map<String, Printer> printerMap) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(printerMap);
        } catch (IOException e) {
            System.out.println("Error saving printers to file: " + e.getMessage());
        }
	}
	
	public static Map<String,Printer> LoadData(){
		Map<String,Printer> printerMap = new HashMap<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
		    printerMap = (HashMap<String, Printer>) ois.readObject();
		} catch (FileNotFoundException e) {
		    System.out.println("No file found. Starting with an empty printer list.");
		} catch (IOException e) {
		    System.out.println("Error reading file: " + e.getMessage());
		} catch (ClassNotFoundException e) {
		    System.out.println("Class not found: " + e.getMessage());
		}
		return printerMap;
	}

}
