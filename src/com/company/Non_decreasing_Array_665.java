package com.company;

public class Non_decreasing_Array_665 {
    public static void main(String[] args) {
        int[] nums = {5,7,1,8};
        System.out.println(checkPossibility(nums));
    }
    public static boolean checkPossibility(int[] nums) {
        int count1 = 0;
        int[] num2 = new int[nums.length];
        int j  = 0;
        for(int i : nums){
            num2[j++] = i;
        }
        int smallElement = nums[nums.length-1];
        int count2 = 0;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i] >= nums[i-1])
                smallElement = nums[i-1];
            else{
                nums[i-1] = smallElement;

                count1++;
            }

        }
        for(int i = 0;i<nums.length-1;i++){
            if(num2[i] > num2[i+1]){
                count2++;
            }
        }
        return count1 == 1 || count2 == 1;
    }

}
