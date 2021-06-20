package com.java.dsalgopuzzles.arrays;

import java.util.Arrays;

public class PushZerosToEnd {

    public static void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
            while (count < n) {
                arr[count++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        pushZerosToEnd(arr, arr.length);
        System.out.println("Array after pushing zeros to the back: ");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}
