package com.company;

import java.util.HashMap;

public class Minimum_Size_Subarray_Sum_209 {
    public static void main(String[] args) {

        int target = 11;
        int[] arr = {1,2,3,4,5};
        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;HashMap<Integer, Integer> hmap = new HashMap<>();
        
        int sum = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum <= target){
                min = Math.min(min, i - left);
                sum -= nums[left++];
            }

        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}
