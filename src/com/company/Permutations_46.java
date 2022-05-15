package com.company;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        // write your code here
        int[] nums = {1,2,3};

        permutation(nums, 0, nums.length - 1);
        System.out.println(res);
    }

    private static void permutation(int[] nums, int i, int j) {
        if (i == j) {
            List<Integer> arr = new ArrayList<>();
            for (int k = 0; k <= j; k++) {
                arr.add(nums[k]);
            }
            res.add(arr);
        } else {
            for (int k = i; k <= j; k++) {
                swaps(nums, k, i);
                permutation(nums, i + 1, j);
                swaps(nums, k, i);
            }
        }
    }

    private static void swaps(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}

