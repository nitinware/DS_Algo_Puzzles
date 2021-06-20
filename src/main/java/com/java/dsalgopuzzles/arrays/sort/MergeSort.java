package com.java.dsalgopuzzles.arrays.sort;

import java.util.Arrays;

public class MergeSort {

    // Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
    // The time complexity of MergeSort is O(n*Log n) in all the 3 cases (worst, average and best)
    // as the mergesort always divides the array into two halves and takes linear time to merge two halves.
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

        sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}
