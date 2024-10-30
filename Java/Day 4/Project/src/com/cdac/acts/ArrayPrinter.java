package com.cdac.acts;
import java.util.*;
public class ArrayPrinter {
	
	public static void printArray(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void printArray(String[] arr,int m) {
		for(int i=0;i<m;i++) {
		System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter no of Integer want to add in Array:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter Numbers:");
	    for(int i=0;i<n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    //sc.nextLine();
	    
		System.out.println("Enter no of words want to add in Array:");
		int m = sc.nextInt();
		String sarr[] = new String[m];
		System.out.println("Enter words:");
		sc.nextLine();
		for(int i=0;i<m;i++) {
			
	    	sarr[i] = sc.nextLine();

	    }
		
		System.out.print("Printing Integer Array:");
		printArray(arr,n);
		System.out.println();
		System.out.print("Printing String Array:");
		printArray(sarr,m);
		sc.close();

	}

}
