package com.company;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1  = {1 ,2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr1, arr2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int i = 0;
        int j = 0;

        if((n&1) != 0){

            int mid = (n)/2;
            int[] arr = new int[mid+1];
            for(int k = 0; k<=mid;k++){
                if(i != nums1.length && j != nums2.length){
                    arr[k] = nums1[i] > nums2[j] ? nums2[j++] : nums1[i++];
                }
                else if(i != nums1.length) arr[k] = nums1[i++];
                else arr[k] = nums2[j++];
            }
            return (double) arr[mid];
        }
        else{
            int mid = (n)/2;
            int[] arr = new int[mid+1];
            for(int k = 0; k<=mid;k++){
                if(i != nums1.length && j != nums2.length){
                    arr[k] = nums1[i] > nums2[j] ? nums2[j++] : nums1[i++];
                }
                else if(i != nums1.length) arr[k] = nums1[i++];
                else arr[k] = nums2[j++];
            }
            return (double) (arr[mid] + arr[mid-1])/2;
        }
    }
}
