package com.ads;

public class IsSorted {
	
	public static boolean isArraySorted(int arr[]) {
		
		for(int i=0; i< arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		//int arr[] = {11, 2, 33, 41, 15, 6, 333, 9, 8};
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println(isArraySorted(arr));
	}

}
