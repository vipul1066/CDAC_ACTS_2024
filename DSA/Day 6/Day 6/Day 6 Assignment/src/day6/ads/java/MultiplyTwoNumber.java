package day6.ads.java;

import java.util.Scanner;

public class MultiplyTwoNumber {
	
	public static int Mutiplication(int a , int b) {
		if(a == 0 || b == 0) {
			return 0;
		}
		if(b ==1) {
			return a;
		}
		
		return a + Mutiplication(a, b-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		int x = Math.abs(a);
		int y = Math.abs(b);
		
		int q = Mutiplication(x,y);
		
		if((a>0 && b<0) || (a<0 && b>0)) {
			System.out.println(-q);
		}
		else {
		System.out.println(q);
		}
		
	}

}
