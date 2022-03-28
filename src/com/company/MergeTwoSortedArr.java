package com.company;

import java.util.*;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = mergeTwoSortedArray(nums1,nums2,m, n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2, int m, int n){
        int[] arr = new int[m+n];
        int j = 0;
        int k = 0;
        for(int i = 0;i< m+n; i++){
            if(j!= m && k!=n){
                arr[i] = (arr1[j] > arr2[k] ? arr2[k++] : arr1[j++]);
            }
            else if(k< n){
                arr[i] = arr2[k++];
            }
            else{
                arr[i] = arr1[j++];
            }
        }
        return arr;
    }
}


