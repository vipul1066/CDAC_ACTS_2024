package com.cdac.acts;
import com.cdac.acts.Fruit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class FruitTest {
	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of fruits want to add: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of Fruit");
			String name = sc.nextLine();
			System.out.println("Enter color of Fruit");
			String color = sc.nextLine();
			System.out.println("Enter price of Fruit");
			int price = sc.nextInt();
			System.out.println("Enter quality of Fruit");
			int quality = sc.nextInt();
			sc.nextLine();
			Fruit fruit = new Fruit(name,color,price,quality);
			fruitList.add(fruit);
			
		}
		System.out.println("Fruit List");
		for(Fruit fruit : fruitList) {
			System.out.println(fruit);
		}

		System.out.println("Enter fruit index to remove");
		int a = sc.nextInt();
		fruitList.remove(a);
		
		// advance for
		System.out.println("Print using advance for loop");
		for(Fruit fruit : fruitList) {
			System.out.println(fruit);
		}
		
		//for each
		System.out.println("Print using for each");
		fruitList.forEach(System.out::println);
		
		//forward iterator
		System.out.println("Print using forward iterator");
		ListIterator<Fruit> iterator = fruitList.listIterator();
		while(iterator.hasNext()) {
			Fruit ele = iterator.next();
			System.out.println(ele);
		}
		
		//backward iterator
		System.out.println("Print using backward iterator");
		ListIterator<Fruit> iteratorReverse = fruitList.listIterator(fruitList.size());
		while(iteratorReverse.hasPrevious()){
			Fruit ele = iteratorReverse.previous();
			System.out.println(ele);
		}
		
		
		
		
	}

}
