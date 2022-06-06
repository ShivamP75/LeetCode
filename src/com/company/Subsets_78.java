package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        generateSubSet(0, nums, subset, new ArrayList<Integer>());
        return subset;
    }

    private static void generateSubSet(int index, int[] nums, List<List<Integer>> subset,  ArrayList<Integer> current) {
        subset.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubSet(i+1, nums, subset, current);
            current.remove(current.size()-1);

        }

    }
}
