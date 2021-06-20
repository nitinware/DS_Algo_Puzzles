package com.java.dsalgopuzzles.arrays;

import java.util.Arrays;

public class SortedArrDupsRemoval {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i])
                continue;
            nums[++i] = nums[j];
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 2, 2, 3};
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
        System.out.println();
        int count = removeDuplicates(nums);
        System.out.println("Count: " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
