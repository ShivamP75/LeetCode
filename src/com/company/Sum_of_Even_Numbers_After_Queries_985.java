package com.company;

import java.util.Arrays;

public class Sum_of_Even_Numbers_After_Queries_985 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] res = sumEvenAfterQueries(nums, queries);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int[] res = new int[nums.length];
        for(int i = 0;i<queries.length;i++){
            int index = queries[i][1];
            int num  = nums[index] + queries[i][0];
            nums[index] = num;

            res[index] = sum(nums);
        }
        return res;
    }

    public static int sum(int[] nums){
        int sumOfEvenNumber = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0) sumOfEvenNumber += nums[i];
        }
        return sumOfEvenNumber;
    }
}
