package com.cdac.acts;
import java.util.Scanner;

public class deleteFromArray {
	public static void deleteFromPosition(int arr[], int n, int pos) {
		
		for(int i=pos;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println("Array Elements are");
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the position to remove element");
		int pos = sc.nextInt();
		
        deleteFromPosition(arr, n, pos);

		
	}


}
