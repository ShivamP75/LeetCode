//package com.company;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        int[] num = {1,2,3,4,5,6,7};
//        int k = 10;
//        k = k% num.length;
//        rotate(num , k);
//        Arrays.sort(num, new SortbyRoll());
//    }
//    public static void rotate(int[] nums, int k) {
//    int[] arrL = new int[(nums.length - k)+1];
//    int[] arrR = new int[k+1];
//        for (int i = 0; i < (nums.length - k)+1; i++) {
//            arrL[i] = nums[i];
//        }
//        System.out.println(Arrays.toString(arrL));
//        for (int i = 0; i < k+1; i++) {
//            arrR[i] = nums[i + k];
//        }
//        System.out.println(Arrays.toString(arrR));
//        arrL = reverseArray(arrL, arrL.length);
//        arrR = reverseArray(arrR, arrR.length);
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//        System.out.println(Arrays.toString(reverseArray(nums, nums.length)));
//    }
//    public static int[] reverseArray(int[] arr, int len){
//        int[] arr1 = new int[len];
//        for (int i = 0; i < len; i++) {
//            arr1[i] = arr[(len - 1 )- i];
//        }
//        return arr1;
//    }
//}
