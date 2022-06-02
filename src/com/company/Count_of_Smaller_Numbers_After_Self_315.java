package com.company;

import java.util.*;

public class Count_of_Smaller_Numbers_After_Self_315 {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        System.out.println(countSmaller(nums));
    }

    public static List<Integer> countSmaller(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        TreeMap<Integer, Integer> map1 = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[nums.length];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            map1.put(nums[i], i);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int x = entry.getKey();
            int y = entry.getValue();
            int z = map1.get(x);
            if(z - y < 0){
                arr[y]  = 0;
            }
            else arr[y] = z - y;
        }
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
