package com.java.dsalgopuzzles.arrays;

public class ThreeLargestArr {

    public static void print3Largest(int[] arr) {
        int size = arr.length;
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        print3Largest(arr);
    }

}
