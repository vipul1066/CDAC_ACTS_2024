package com.cdac.acts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AppleTester {
	public static void main(String[] args) {
		List<Apple> listApple = new ArrayList<>();
		listApple = DataUtil.getData();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("1. Add Apple");
			System.out.println("2. Separate Green and Red Apples");
			System.out.println("3. Sort apple by color and weight");
			System.out.println("4. Convert to Set");
			System.out.println("0. To exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter Weight of Apple");
				Integer weight= sc.nextInt();
				System.out.println("Enter Color of Apple");
				sc.nextLine();
				String color = sc.nextLine();
				System.out.println("Enter Taste of Apple");
				String taste = sc.nextLine();
				Apple apple = new Apple(weight, color, taste);
				listApple.add(apple);
				System.out.println("Apple Added successfully!!");
			}break;
			case 2: {
				Map<Boolean, List<Apple>> streamList = listApple.stream()
						.collect(Collectors.partitioningBy(apple-> "Green".equals(apple.getColor())));
						
				List<Apple> greenApples = streamList.get(true);
                List<Apple> redApples = listApple.stream()
                        .filter(apple -> "Red".equals(apple.getColor()))
                        .collect(Collectors.toList());
                
                System.out.println("Green Apples: " + greenApples.size());
                greenApples.forEach(a -> System.out.println(a));

                System.out.println("Red Apples: " + redApples.size());
                redApples.forEach(a -> System.out.println(a));
			}break;
			case 3:{
				List<Apple> streamApple = listApple.stream()
						.sorted(Comparator.comparing(Apple::getColor)
								.thenComparing(Apple::getWeight))
						.collect(Collectors.toList());
				
				System.out.println("Sorted Apples");
				streamApple.forEach(System.out::println);
			} break;
			case 4:{
				Set<Apple> setApple = listApple.stream()
						.collect(Collectors.toSet());
				setApple.forEach(System.out::println);

			} break;
			case 0:{
				System.out.println("You entered wrong choice");
			} break;
			}}while(n!=0);
	}

}
