package com.java.dsalgopuzzles.arrays;

import java.util.Arrays;

// Given an array (or string), the task is to reverse the array/string.
public class ArrayReverse {

    public static void reverseArray(int arr[]) {
        int temp;
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        reverseArray(arr);
        System.out.println("Reversed Array");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}
