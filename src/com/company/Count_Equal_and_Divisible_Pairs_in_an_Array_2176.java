package com.company;

public class Count_Equal_and_Divisible_Pairs_in_an_Array_2176 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(nums,k));
    }
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1; j<nums.length;j++){
                if((nums[i] == nums[j]) && ((i*j) % k ==0 )){
                    count++;
                }
            }
        }
        return count;
    }
}
