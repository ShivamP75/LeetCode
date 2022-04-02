package com.company;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length && i < nums.length){
            if(nums[i] == 0 && nums[j] == 0){
                j++;
                if(j == nums.length) {
                    return;
                }
            }
            if(nums[j] != 0){
                if(nums[i] == 0){
                    swap(nums,i,j);
                }
                i++;
                j++;
            }

        }
    }
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
