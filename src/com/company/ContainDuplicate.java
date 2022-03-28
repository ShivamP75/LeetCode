package com.company;

import java.util.HashSet;

public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            if(set.add(nums[i]) == false){
                return true;
            }
        }
        return false;
    }
}
