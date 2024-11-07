package com.cdac.acts;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTester {

	public static void main(String[] args) {
		Map<String, Books> treeSet = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("*****Menu*****");
			System.out.println("1. Add Book");
			System.out.println("2. Display all Books");
			System.out.println("3. Allot Book to Student");
			System.out.println("4. Return Book");
			System.out.println("5. Remove Book");
			System.out.println("0. To exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			switch(n) {
			case 1: {
				System.out.println("Enter book title");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.println("Enter book type(fantacy,mystery,novel,adventure,thriller,history,history");
				String booktype = sc.nextLine();
				System.out.println("Enter Book price");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Published Date");
				String strDate = sc.nextLine();
				System.out.println("Enter Author name");
				String authorName = sc.nextLine();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				sc.nextLine();
				
				BookType validBookType = ValidationUtils.getValidBookType(booktype);
				LocalDate validDatePublishDate = ValidationUtils.validatePublishedDate(strDate);
				
				Books b = new Books(title, validBookType,price, validDatePublishDate, authorName, quantity);
				treeSet.put(b.getTitle(), b);
				System.out.println("Book added successfully");
				
				
			} break;
			
			case 2 : {
				System.out.println("All Books Info. as Follows");
				Set<Map.Entry<String,Books>> entries = treeSet.entrySet();
				for(Map.Entry<String, Books> entry : entries) {
					System.out.println(entry.getValue());
				}
				//System.out.println(hashmap);
			}break;
			
			case 3:{
				System.out.println("Enter Book title");
				sc.nextLine();
				String title = sc.nextLine();
				Books b = treeSet.get(title);
				Integer no = b.getQuantity();
				no -= 1;
				b.setQuantity(no);
				System.out.println("Book Alloted successfully!!");
				System.out.println(b);
			} break;
			
			case 4: {
				System.out.println("Enter Book title");
				sc.nextLine();
				String title = sc.nextLine();
				Books b = treeSet.get(title);
				Integer no = b.getQuantity();
				no += 1;
				b.setQuantity(no);
				System.out.println("Book Return successfully!!");
				System.out.println(b);
				
			} break;
			
			case 5: {
				System.out.println("Enter Book title");
				sc.nextLine();
				String title = sc.nextLine();
				treeSet.remove(title);
				System.out.println("Book removed Successfully!!");
			} break;
			case 0:{
				System.out.println("You exited");
			}break;
			default:{
				System.out.println("You entered wrong choice");
			}
			
			}} while (n!=0);

	}

}
