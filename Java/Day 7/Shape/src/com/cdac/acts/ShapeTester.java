package com.cdac.acts;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = new Circle();
		Shape sh1 = new Rectangle();

		int choice = 0;
		
		do {
			System.out.println("1. For Circle ");
			System.out.println("2. For Rectangle");
			System.out.println("0. exit");
		
			System.out.println("Enter choice");
			choice = sc.nextInt(); 
			switch (choice) {
			case 1:
			{
				Circle c = (Circle)sh;
				System.out.println("Enter radius ");
				double radius = sc.nextDouble();
				c.setRadius(radius);
				System.out.println(c.calculateArea());
				System.out.println(c.calculatePerimeter());
				c.draw();
				
			}break;
			
			case 2:
			{
				Rectangle r = (Rectangle)sh1;
				System.out.println("Enter Length ");
				double length = sc.nextDouble();
				System.out.println("Enter Breadth ");
				double breadth = sc.nextDouble();
				r.setLength(length);
				r.setBreadth(breadth);
				System.out.println(r.calculateArea());
				System.out.println(r.calculatePerimeter());
				
			}break;
			
			default:
				System.out.println("Invalid Choice");	
				
			}
		}while(choice !=0);
	}

}
