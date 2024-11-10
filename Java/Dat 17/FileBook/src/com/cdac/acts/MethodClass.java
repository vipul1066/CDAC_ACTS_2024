package com.cdac.acts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MethodClass {
	private final static String filename = "C:\\Users\\vipul\\Documents\\data\\dataBooks.dat";
	
	public static void saveBook(Books book,DataOutputStream dos) throws IOException {
		dos.writeInt(book.getId());
		dos.writeUTF(book.getTitle());
		dos.writeUTF(book.getAuthor());
		dos.writeDouble(book.getPrice());
	}
	
	
	public static void saveOneBook(Books book) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename,true))) {
			saveBook(book,dos);	
		} catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
		}
	}
	
	public static void saveManyBooks(List<Books> bookList) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename,true))) {
			for(Books book: bookList) {
			saveBook(book,dos);	
			}
		} catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
		}
	}
	
public static Books ReadBook(DataInputStream dis) throws IOException {
		Integer id = dis.readInt();
		String title = dis.readUTF();
		String author = dis.readUTF();
		Double price = dis.readDouble();
		return new Books(id,title,author,price);
	}
	
	
	public static Books ReadOneBook() {
		try(DataInputStream dis = new DataInputStream( new FileInputStream(filename))) {
			Books book=null;
			if (dis.available() > 0) {
                book = ReadBook(dis);
                return book;
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public static List<Books> ReadManyBook() {
		try(DataInputStream dis = new DataInputStream( new FileInputStream(filename))) {
			List<Books> book = new ArrayList<>();
			while (dis.available() > 0) {
                book.add(ReadBook(dis)); 
            }
			return book;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
