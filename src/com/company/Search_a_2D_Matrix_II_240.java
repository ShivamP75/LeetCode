package com.company;

import java.util.Arrays;

public class Search_a_2D_Matrix_II_240 {
    public static void main(String[] args) {
        int[][] mat = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        System.out.println(searchMatrix(mat, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;
        for(int i = 0;i<matrix[0].length;i++){
            int[] arr = matrix[i];
            System.out.print(Arrays.toString(arr) + " ");
            flag = bSearch(arr,target);
            if(flag) return flag;
        }
        return flag;
    }

    public static boolean bSearch(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == k ) return true;
            else if(arr[mid] > k) high = mid-1;
            else low = mid + 1;
        }
        return false;
    }
}
