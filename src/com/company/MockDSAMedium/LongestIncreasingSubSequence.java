package com.company.MockDSAMedium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] arr = {0,8,4,12,2,10,6,14,1,9,5, 13,3,11,7,15};

        int[] dp = new int[arr.length];
        dp[0] = 1;
//        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            int k = 0;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j])
                    if(dp[j] > max){
                        max = dp[j];
                    }
            }

            dp[i] = max+1;
        }
        int maxAns = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            maxAns = Math.max(dp[i], maxAns);
        }
        System.out.println(maxAns);
//        System.out.println(list);
    }
}
