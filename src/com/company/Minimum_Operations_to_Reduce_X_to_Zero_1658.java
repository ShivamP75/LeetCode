package com.company;

public class Minimum_Operations_to_Reduce_X_to_Zero_1658 {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9};
        int x = 4;
        System.out.println(minOperations(nums, x));
    }
    public static int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int maxLength = -1, currSum = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            currSum += nums[r];
            while(l <= r && currSum > sum - x) currSum -= nums[l++];
            if(currSum == sum - x) maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength == -1 ? -1 : nums.length - maxLength;
//        int i = 0;
//        int j = nums.length-1;
//        int count = 0;
//        while(x != 0){
//            if(i > j){
//                return -1;
//            }
//            else if(x < 0){
//                return -1;
//            }
//            else if(nums[i] > nums[j]){
//                if(x >= nums[i]) {
//                    x -= nums[i];
//                    count++;
//                }
//                i++;
//
//            }
//            else if(nums[j] >= nums[i]){
//                if(x >= nums[j]){
//                    x -= nums[j];
//                    count++;
//                }
//                j--;
//            }
//
//        }
//        return count;
    }
}
