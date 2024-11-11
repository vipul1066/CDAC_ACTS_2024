package ads.java;

import java.util.Arrays;

public class QueueTester {
    
    public static <T> void reverseArrayUsingQueue(T[] arr, Queue<T> q) {
        for (T element : arr) {
            q.enqueue(element);
        }

        for (int i = arr.length - 1; i >= 0; --i) {
            arr[i] = q.dequeue();
        }
    }
    
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before reversing - " + Arrays.toString(nums));
        
        Queue<Integer> q = new GenericQueue<>(10);
        reverseArrayUsingQueue(nums, q);

        System.out.println("After reversing - " + Arrays.toString(nums));
    }
}
