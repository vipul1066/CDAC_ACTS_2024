package com.cdac.acts;
import java.util.ArrayList;
import java.util.Scanner;
public class doubleArraylist {
	public static void main(String[] main) {
		ArrayList<Double> doubleList = new ArrayList<Double>(10);
		System.out.println("Enter 10 Elements");
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
			Double num = sc.nextDouble(); 
			doubleList.add(num);
			n++;	
		} while (n<10);
		
		double sum =0;
		for(int i=0;i<10;i++) {
			sum += doubleList.get(i); 
		}
		System.out.println("Sum= " + sum);
		
		System.out.println("Enter a number to find its index");
		double num = sc.nextDouble();
		if(doubleList.indexOf(num)== -1) {
			System.out.println("Number is not present in list");
		}
		else {
		System.out.println("Index : " + doubleList.indexOf(num));
		}
		
		System.out.println("Enter a number to find its last index");
		double number = sc.nextDouble();
		if(doubleList.lastIndexOf(number)== -1) {
			System.out.println("Number is not present in list");
		}
		else {
		System.out.println("Last Index : " + doubleList.lastIndexOf(number));
		}
	}

}
