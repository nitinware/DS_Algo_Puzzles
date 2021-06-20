package com.java.dsalgopuzzles.arrays;

import java.util.Arrays;

// Two Sum II - Input array is sorted
// Given an array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.
public class TwoSumPointer {

    public static int[] twoSum(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while (lo < hi) {
            int curSum = nums[lo] + nums[hi];
            if (curSum == target)
                return new int[] {lo+1, hi+1};
            else if (curSum > target)
                hi--;
            else
                lo++;
        }
        return new int[] {-1, 1};
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] output = twoSum(arr, target);
        Arrays.stream(output).forEach(x -> System.out.print(x + " "));
    }

}
