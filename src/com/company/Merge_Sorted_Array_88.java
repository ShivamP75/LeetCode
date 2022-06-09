package com.company;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        for(int i = 0;i<m;i++){
            arr[i] = nums1[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while(i != arr.length && j != nums2.length){
            if(arr[i] > nums2[j]){
                nums1[k++] = nums2[j++];
            }
            else{
                nums1[k++] = arr[i++];
            }
        }

        while(i != arr.length){
            nums1[k++] = arr[i++];
        }
        while(j != nums2.length){
            nums1[k++] = nums2[j++];
        }
    }
}
