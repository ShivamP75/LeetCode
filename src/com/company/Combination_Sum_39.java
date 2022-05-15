package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_39 {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<Integer> arr = new ArrayList<>();
        combinationSum(candidates, target, arr);
        System.out.println(res);
    }
    public static void combinationSum(int[] candidates, int target , List<Integer> arr) {
        if(candidates.length > 0){
            int sum = 0;
            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);

            }
            if(sum == target){
                res.add(arr);
            }
        }
        else{
            
        }
    }

    private static void swaps(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
