package com.company;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        System.out.println(minElement(arr));
    }

    private static int minElement(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        if(arr[low] < arr[high]) return arr[low];
        while(low < high){
            int mid = low + (high - low)/2;

            if(mid > 0 && arr[mid-1] > arr[mid]) return arr[mid];
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else high = mid-1;
        }
        return arr[low];
    }
}
