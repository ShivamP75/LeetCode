package com.company;

import java.util.Arrays;

public class Count_Prime {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {
        boolean[] arr = primeNumb(n);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]) count++;
        }
        return count;
    }

    public static boolean[] primeNumb(int n){
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i = 2;i*i<n;i++){
            if(arr[i]){
                for(int j = i*2; j<n;j = j+i){
                    arr[j] = false;
                }
            }
        }
        return arr;

    }
}
