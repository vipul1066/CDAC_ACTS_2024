package com.ads;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, mid + 1, end);
        }
    }

    public static void merge(int[] arr, int startPos1, int endPos1, int startPos2, int endPos2) {
        int[] mergedArray = new int[endPos2 - startPos1 + 1];
        int i1 = startPos1;
        int i2 = startPos2;
        int r = 0;

        while (i1 <= endPos1 && i2 <= endPos2) {
            if (arr[i1] < arr[i2]) {
                mergedArray[r++] = arr[i1++];
            } else {
                mergedArray[r++] = arr[i2++];
            }
        }

        while (i1 <= endPos1) {
            mergedArray[r++] = arr[i1++];
        }

        while (i2 <= endPos2) {
            mergedArray[r++] = arr[i2++];
        }

        int i = startPos1;
        int j = 0;
        while (i <= endPos2) {
            arr[i++] = mergedArray[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
