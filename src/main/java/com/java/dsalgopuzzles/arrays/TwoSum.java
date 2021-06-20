package com.java.dsalgopuzzles.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
public class TwoSum {

    // Time Complexity: O(N^2) - as there is nested looping over the array
    public static int[] twoSum_brute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                return new int[] {i,  j};
            }
        }
        throw new IllegalArgumentException("No Two Sum solution");
    }

    // Time Complexity: O(N) - We traverse the list containing nn elements exactly twice,
    // Since the hash table reduces the look up time to O(1), the time complexity is O(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i+1, map.get(complement)+1};
            }
        }
        throw new IllegalArgumentException("No Two Sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        //int[] output = twoSum_brute(nums, 9);
        int[] output = twoSum(nums, 9);
        Arrays.stream(output).forEach(x -> System.out.print(x + " "));
    }
}
