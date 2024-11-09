package com.cdac.acts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringList {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<>();
		stringlist = DataUtil.getData();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1. Print all String");
			System.out.println("2. Print Distinct");
			System.out.println("3. Print all in UpperCase");
			System.out.println("4. print which starts with specific character");
			System.out.println("5. Concate all Strings in the list");
			System.out.println("6. Filter by ending with text");
			System.out.println("0. to exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			
			switch(n) {
			case 1:{
				stringlist.forEach(System.out::println);
			} break;
			case 2:{
				List<String> streamlist = stringlist.stream()
						.distinct()
						.collect(Collectors.toList());
						
				streamlist.forEach(System.out::println);
			} break;
			case 3:{
				List<String> streamlist = stringlist.stream()
						.map(element -> element.toUpperCase())
						.collect(Collectors.toList());
				System.out.println("Converted to Uppercase");
				streamlist.forEach(System.out::println);
			} break;
	
			case 4:{
				System.out.println("Enter a character");
				sc.nextLine();
				String ch = sc.nextLine();
				List<String> streamlist = stringlist.stream()
						.filter(list -> list.startsWith(ch))
						.collect(Collectors.toList());
				System.out.println("Letters starts with "+ch);
				streamlist.forEach(System.out::println);
				
			}break;
			case 5:{
				System.out.println("Concat all Strings are");
				String streamlist = stringlist.stream()
						.collect(Collectors.joining(" "));
				System.out.println("The concat string is: "+streamlist);
				
			} break;
			case 6:{
				System.out.println("Enter a character");
				sc.nextLine();
				String ch = sc.nextLine();
				List<String> streamlist = stringlist.stream()
						.filter(list -> list.endsWith(ch))
						.collect(Collectors.toList());
				System.out.println("Letters ends with "+ch);
				streamlist.forEach(System.out::println);
			}break;
			case 0:{
				System.out.println("You exited....");
			} break;
			default:{
				System.out.println("You entered wrong number");
			}	
			}}while(n!=0);
		
	}

}
