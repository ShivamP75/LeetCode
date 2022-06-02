package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order_138 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
//        Arrays.fill(target, -1);
//        for (int i = 0; i < nums.length; i++) {
//            if(target[index[i]] == -1){
//                target[index[i]] = nums[i];
//            }
//            else{
//                int j = index[i];
//                while(target[j] != -1 && j < nums.length-2){
//                    int temp = target[j+1];
//                    target[j+1] = target[j];
//                    target[j+2] = temp;
//                    j++;
//                }
//                target[index[i]] = nums[i];
//            }
//        }
//        System.out.println(arr);
        int j = 0;
        for (int i : arr) {
            target[j] = i;
            j++;
        }
        return target;



    }
}
