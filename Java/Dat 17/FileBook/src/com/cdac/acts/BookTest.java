package com.cdac.acts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		List<Books> bookList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("****Menu****");
			System.out.println("1.Save one Book");
			System.out.println("2.Save Many Books");
			System.out.println("3.Read one Book");
			System.out.println("4.Read All Books");
			System.out.println("0. To Exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			
			switch(n) {
			case 1:{
				System.out.println("Enter Book ID");
				Integer id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Book Title");
				String title = sc.nextLine();
				System.out.println("Enter Author name");
				String name = sc.nextLine();
				System.out.println("Enter Price");
				Double price = sc.nextDouble();
				Books book = new Books(id,title,name,price);
				MethodClass.saveOneBook(book);
				System.out.println("Book Saved in File successfully!!");
			} break;
			
			case 2:{
				System.out.println("Enter Number of Books want to add");
				int x = sc.nextInt();
				for(int i=0;i<x;i++) {
					System.out.println("Enter Book ID");
					Integer id = sc.nextInt();
					System.out.println("Enter Book Title");
					sc.nextLine();
					String title = sc.nextLine();
					System.out.println("Enter Author name");
					String name = sc.nextLine();
					System.out.println("Enter Price");
					Double price = sc.nextDouble();
					Books book = new Books(id,title,name,price);
					bookList.add(book);
				}
				MethodClass.saveManyBooks(bookList);
				System.out.println("Books Saved in File successfully!!");
			} break;
			case 3:{
				if(MethodClass.ReadOneBook() != null) {
					Books book = MethodClass.ReadOneBook();
					System.out.println("Book Information as below");
					System.out.println(book);
				}
				else {
					System.out.println("File is Empty");
				}
			}break;
			
			case 4:{
				if( MethodClass.ReadManyBook() != null) {
					List<Books> bookFromFile = MethodClass.ReadManyBook();
					bookFromFile.forEach(System.out::println);
					
				}else {
					System.out.println("File is empty");
				}
			} break;
			
			case 0:{
				System.out.println("You Exited");
			}break;
			
			default:{
				System.out.println("You entered wrong choice");
			}
			}}while(n!=0);
				
		
		
	}

}
