package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int j = 1;
        while(j <= nums.length){
            if(!set.contains(j)){
                arr.add(j);
            }
            j++;
        }
        return arr;
    }
}
