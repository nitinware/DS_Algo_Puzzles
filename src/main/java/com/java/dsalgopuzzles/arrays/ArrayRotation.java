package com.java.dsalgopuzzles.arrays;

import java.util.Arrays;

// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
public class ArrayRotation {

    // Time complexity : O(n * d)
    public static void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotate(arr, n);
        }
    }

    private static void leftRotate(int[] arr, int n) {
        int temp= arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2, 7);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}
