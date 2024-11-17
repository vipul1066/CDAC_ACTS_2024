package com.ads;

public class FindElement {
	
	public static boolean findUsingLinearSearch(int arr[], int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {11,2,33,41,15,6,333,9,8};
		int n = 9;
		System.out.println(findUsingLinearSearch(arr, n));
	}

}
