package com.cdac.acts;
import com.cdac.acts.Fruits;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FruitsTest {
	public static void main(String[] args) {
		ArrayList<Fruits> fruitList = new ArrayList<Fruits>();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("1. Add Fruit");
			System.out.println("2. Sort fruits by color");
			System.out.println("3. Sort by quantity");
			System.out.println("4. Sort by price");
			System.out.println("0. To exit");
			n = sc.nextInt();
			
			switch(n) {
			case 1: {
				sc.nextLine();
				System.out.println("Enter name of Fruit");
				String name = sc.nextLine();
				System.out.println("Enter color of Fruit");
				String color = sc.nextLine();
				System.out.println("Enter price of Fruit");
				int price = sc.nextInt();
				System.out.println("Enter quality of Fruit");
				int quality = sc.nextInt();
				sc.nextLine();
				Fruits fruit = new Fruits(name,color,price,quality);
				fruitList.add(fruit);
			} break;
			
			case 2: {
				System.out.println("Sort by fruit color");
				Collections.sort(fruitList, new colorComparator());
				for(Fruits fruit : fruitList) {
					System.out.println(fruit);
				}
			} break;
			case 3: {
				System.out.println("Sort by quantity");
				Collections.sort(fruitList, new quantityComparator());
				for(Fruits fruit : fruitList) {
					System.out.println(fruit);
				}
			} break;
			case 4 :{
				System.out.println("Sort by price");
				Collections.sort(fruitList, new priceComparator());
				for(Fruits fruit : fruitList) {
					System.out.println(fruit);
				}
			} break;
			case 0 : {
				System.out.println("You exited...");
			}break;
			
			default : {
				System.out.println("You entered wrong choice");
			}
			
			}} while (n!=0);
		
	}

}
