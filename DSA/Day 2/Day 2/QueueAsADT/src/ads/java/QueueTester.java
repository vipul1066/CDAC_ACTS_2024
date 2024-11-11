package ads.java;

import java.util.Arrays;

public class QueueTester {
	
	public static void reverseArrayUsingQueue(int[] arr, Queue q) {
		for (int i = 0; i < arr.length; ++i) {
			q.enqueue(arr[i]);
		}

		for (int i = arr.length-1; i >= 0; --i) {
			arr[i] = q.dequeue();
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println("Before reversing - " + Arrays.toString(nums));
		
		Queue q = new FixedSizeQueue(10);
		reverseArrayUsingQueue(nums, q);

		System.out.println("After reversing - " + Arrays.toString(nums));
	}
}
