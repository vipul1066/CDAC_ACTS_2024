package com.cdac.acts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AppleTester {
	public static void main(String[] args) {
		
		List<Apple> list = new ArrayList<>();
		list = DataUtil.getData(); 
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1. Display Data");
			System.out.println("2. Filter by weight");
			System.out.println("3. Filter by color");
			System.out.println("4. Filter by color and weight");
			System.out.println("5. Filter by color, weigth and taste");
			System.out.println("6. Sort by weight");
			System.out.println("7. Sort by color");
			System.out.println("8. Remove red apples");
			System.out.println("9. Remove Green apples");
			System.out.println("10. Convert to Set collections");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			
			switch(n) {
			case 1:{
				list.forEach(System.out::println);
			} break;
			case 2: {
				System.out.println("Enter the Weight");
				Integer weight = sc.nextInt();
				System.out.println("Filtered by Weight");
				List<Apple> streamList = list.stream()
						.filter( apple -> weight.equals(apple.getWeight()))
						.collect(Collectors.toList());
				streamList.forEach(System.out::println);			
			} break;
			
			case 3:{
				System.out.println("Enter the color");
				sc.nextLine();
				String color = sc.nextLine();
				System.out.println("Filtered by color");
				List<Apple> streamList = list.stream()
						.filter( apple -> color.equals(apple.getColor()))
						.collect(Collectors.toList());
				streamList.forEach(System.out::println);
			}break;
			
			case 4:{
				System.out.println("Enter the Color");
				sc.nextLine();
				String color = sc.nextLine();
				
				System.out.println("Enter the Weight");
				Integer weight = sc.nextInt();
				System.out.println("Filtered by color and Weight");
				
				List<Apple> streamList = list.stream()
						.filter( apple -> color.equals(apple.getColor()) && weight.equals(apple.getWeight()))
						.collect(Collectors.toList());
				
				streamList.forEach(System.out::println);
			} break;
			case 5:{
				System.out.println("Enter the Color");
				sc.nextLine();
				String color = sc.nextLine();
				
				System.out.println("Enter the Weight");
				Integer weight = sc.nextInt();
				
				System.out.println("Enter the Taste");
				sc.nextLine();
				String taste = sc.nextLine();
				
				System.out.println("Filtered by color, Weight and Taste");
				
				List<Apple> streamList = list.stream()
						.filter( apple -> color.equals(apple.getColor()) 
								       && weight.equals(apple.getWeight())
								       && taste.equals(apple.getTaste())
								)
						.collect(Collectors.toList());
				
				streamList.forEach(System.out::println);
			} break;
			case 6:{
				System.out.println("Sort by Weight");
				List<Apple> streamlist = list.stream()
				            .sorted((s1, s2) -> s1.getWeight().compareTo(s2.getWeight()))
				            .collect(Collectors.toList());
//				Collections.sort(list, (s1, s2)-> s1.getWeight().compareTo(s2.getWeight()));
				streamlist.forEach(System.out::println);
			} break;
			case 7:{
				System.out.println("Sort by Color");
				List<Apple> streamList = list.stream()
						.sorted((s1,s2) -> s1.getColor().compareTo(s2.getColor()))
						.collect(Collectors.toList());
//				Collections.sort(list, (s1, s2)-> s1.getColor().compareTo(s2.getColor()));
				streamList.forEach(System.out::println);
			}break;
			case 8:{
				String str = "Red";
				List<Apple> streamList = list.stream()
						.filter(apple -> !str.equals(apple.getColor()))
						.collect(Collectors.toList());
				list = streamList;
				System.out.println("Red Apple Removed sussceefully");
				System.out.println("The remaining Apples as Follows");
				list.forEach(System.out::println);
//				String str = "Red";
//				list.removeIf(apple -> "Red".equals(apple.getColor()));
//				System.out.println("Remaining apples");
//				list.forEach(System.out::println);
			}break;
			case 9:{
				String str = "Green";
				List<Apple> streamList = list.stream()
						.filter(apple -> !str.equals(apple.getColor()))
						.collect(Collectors.toList());
				list = streamList;
				System.out.println("Green Apple Removed sussceefully");
				System.out.println("The remaining Apples as Follows");
				list.forEach(System.out::println);
				
//				String str = "Green";
//				list.removeIf(apple -> "Green".equals(apple.getColor()));
//				System.out.println("Remaining apples");
//				list.forEach(System.out::println);
			} break;
			case 10:{
				 Set<Apple> set = list.stream()
						 .collect(Collectors.toSet());
				 
				 System.out.println("Converted to Set");
				 set.forEach(System.out::println);
			
			} break;
			default:{
				System.out.println("You entered wrong choice");
			}
			
			
		}}while(n!=0);
		
	}

}
