package com.company;

import java.util.HashMap;

public class Subarray_Sum_Equals_K_560 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum  = 0;
        map.put(sum , 1);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];

            if(map.containsKey(sum - k)){

                count += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }
            else map.put(sum, 1);
        }
        return count;
    }
}
