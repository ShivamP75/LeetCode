package com.company;

import java.util.Arrays;

public class FindFirstAndLastIndexofKinArray {
    public static void main(String[] args) {
        int[] arr = {2};
        int k = 2;
        System.out.println(Arrays.toString(searchRange(arr, k)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int[] arr = new int[2];
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return  resArr(nums, mid, target);
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
    public static int[] resArr(int[] nums, int mid, int target){
        int i = mid;
        int j = mid;
        int[] arr = new int[2];
        while((i >= 0 && nums[i] == target)){
            if(nums[i] == target) --i;
        }
        while(j < nums.length && nums[j] == target){
            if(nums[j] == target) ++j;
        }
        arr[0] = ++i;
        arr[1] = --j;
        return arr;
    }
}
