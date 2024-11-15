package day6.ads.java;

import java.util.Scanner;

public class Division {
	
	public static int quotient(int a , int b) {
		if(a < b) {
			return 0;
		}
			
		return 1 + quotient(a-b, b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int x = Math.abs(a);
		int y = Math.abs(b);
		
		int q = quotient(x,y);
		
		if((a>0 && b<0) || (a<0 && b>0)) {
			System.out.println(-q);
		}
		else {
		System.out.println(q);
		}
		
		
	}

}
