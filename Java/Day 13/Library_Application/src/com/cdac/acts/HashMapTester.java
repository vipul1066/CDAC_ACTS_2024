package com.cdac.acts;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import com.cdac.acts.DuplicateEntry;
public class HashMapTester {

	public static void main(String[] args) {
		Map<String,Books> hashmap = new HashMap<>();
		hashmap = DataUtility.getData();
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
				
				Books book = new Books(title, validBookType,price, validDatePublishDate, authorName, quantity);
				
				Boolean checkDuplicate = DataUtility.CheckDuplicate(book, hashmap);
				try {
				if(!checkDuplicate) {
						hashmap.put(book.getTitle(), book);
						System.out.println("Book added successfully");
				}
				else {
					throw new DuplicateEntry("Duplicate entries not allowed");
				}
			}catch(DuplicateEntry e) {
				System.out.println(e.getMessage());
			}
				
				
				
			} break;
			
			case 2 : {
				// System.out.println("All Books Info. as Follows");
				// Set<Map.Entry<String,Books>> entries = hashmap.entrySet();
				// for(Map.Entry<String, Books> entry : entries) {
				// 	System.out.println(entry.getValue());
				// }
				hashmap.values().forEach(System.out::println);
				//System.out.println(hashmap);
			}break;
			
			case 3:{
				System.out.println("Enter Book title");
				sc.nextLine();
				String title = sc.nextLine();
				Boolean Flag=false;
				
				try {
				if(hashmap.get(title) != null) {
				        Books book = hashmap.get(title);
				        Flag =true;
				        if (book.getQuantity() <= 0) {
			            System.out.println("No copies available for allotment.");
			            } else {
			            	book.setQuantity(book.getQuantity() - 1);
			            	System.out.println("Book allotted successfully! Remaining quantity: " + book.getQuantity());
			        }
				}
				if(!Flag) {
					throw new BookNotFoundException("Book not found exception");
				}
			} catch(BookNotFoundException e){
					System.out.println(e.getMessage());
			}
				
			} break;
			
			case 4: {
				System.out.println("Enter Book title");
				sc.nextLine();
				String title = sc.nextLine();
				Books b = hashmap.get(title);
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
				hashmap.remove(title);
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
