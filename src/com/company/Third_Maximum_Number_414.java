package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Third_Maximum_Number_414 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                arr.add(nums[i]);
            }
        }
            Collections.sort(arr);
            if (arr.size() < 3) return arr.get(arr.size() - 1);
            return arr.get(arr.size() - 3);
    }
}
