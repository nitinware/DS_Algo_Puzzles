package com.java.dsalgopuzzles.arrays;

public class ArrayLargest {

    public static int largest(int arr[]) {
        int i;
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            max = (arr[j] > max) ? arr[j] : max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 324, 45, 90, 9808};
        System.out.println("Largest in given array is: " + largest(arr));
    }

}
