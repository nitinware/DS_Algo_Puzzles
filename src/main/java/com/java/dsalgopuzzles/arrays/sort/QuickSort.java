package com.java.dsalgopuzzles.arrays.sort;

import java.util.Arrays;

public class QuickSort {

    // Quick Sort Time Complexity
    // The best-case time complexity of Quicksort is: O(n log n)
    // The best-case time complexity of Quicksort is also: O(n log n)
    // The worst-case time complexity of Quicksort is: O(n²)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1);
        for (int j = low; j <= high-1; j++) {
           if(arr[j] < pivot) {
               i++;
               swap(arr, i, j);
           }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        System.out.println("Given Array");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        quickSort(arr, 0, n - 1);
        System.out.println();
        System.out.println("Sorted Array");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}
