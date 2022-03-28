package com.company;

import java.util.Arrays;


public class ProductOfArrayItselt {
    public static void main(String[] args) {
        int[] arr = {0 , 0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prePro = 1;

        int suffPro = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = suffPro;
            suffPro *= nums[i];
        }
        for (int i = nums.length-1; i >= 0 ; i--) {
            res[i] *= suffPro;
            suffPro *= nums[i];
        }
        return res;
    }
}
