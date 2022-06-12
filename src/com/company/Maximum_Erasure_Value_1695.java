package com.company;

import java.util.HashSet;

public class Maximum_Erasure_Value_1695 {
    public static void main(String[] args) {
        int[] nums = {10000,1,10000,1,1,1,1,1,1};
        System.out.println(maximumUniqueSubarray(nums));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int maxSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int startWin = 0;
        int currSum = 0;
        while(i < nums.length){
            if(!set.contains(nums[i])){
                currSum += nums[i];
                maxSum = Math.max(currSum, maxSum);
                set.add(nums[i]);
                i++;
            }
            else{
                currSum -= nums[startWin];
                set.remove(nums[startWin++]);
            }
        }

        return maxSum;
    }
}
