package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Largest_Perimeter_Triangle {
    public static void main(String[] args) {
        int[] arr = {2, 1 ,2};
  
    }

    private static int resPerimeter(int[] arr) {
        Arrays.sort(arr);
        for(int i = arr.length-3 ; i >=0 ; --i){
            if(arr[i] + arr[i+1] > arr[i+2]){
                return arr[i] + arr[i+1] + arr[i+2];
            }
        }
        return 0;
    }
}
