package com.company;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int k = 1;
        System.out.println(search(arr, k));
    }

    public static int search(int[] nums, int target) {

        return bSearch(nums, 0, nums.length-1, target);
    }

    public static int bSearch(int[] arr, int low, int high, int k) {
        int mid = (low + high)/2;

        if(low > high) return -1;

        if(arr[mid] == k) return mid;

        else if(arr[low] <= arr[mid]){
            if(arr[mid] > k  && k >= arr[low]) {
                return bSearch(arr, low, mid - 1, k);
            }
            else{
                return bSearch(arr,mid+1,high, k);
            }
        }
        else{
            if(arr[mid] < k && k <= arr[high]){
                return bSearch(arr,mid+1, high, k);
            }
            else{
                return bSearch(arr,low, mid-1, k);
            }
        }

    }
}
