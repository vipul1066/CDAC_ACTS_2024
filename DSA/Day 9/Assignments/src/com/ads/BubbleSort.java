package com.ads;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j =0;j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {11,2,33,41,15,6,333,9,8};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
