package com.company;

import java.util.Arrays;

public class Longest_Consecutive_Sequence_128 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        int longestns = 0;
        Arrays.sort(nums);
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] + 1 == nums[i]){
                count++;
                longestns = Math.max(count, longestns);
            }
            else{
                count = 1;
            }
        }
        return longestns;
    }
}
