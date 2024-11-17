package com.ads;

public class BinarySearch {
	
	public static boolean findUsingBinarySearch(int arr[], int n) {
		int start=0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			if(arr[mid] == n) {
				return true;
			}
			if(arr[mid] > n) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 1 , 2, 3, 4, 5, 6, 7, 8, 10};
		int n = 4;
		System.out.println(findUsingBinarySearch(arr, n));
	}

}
