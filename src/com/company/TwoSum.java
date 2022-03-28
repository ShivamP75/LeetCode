package com.company;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> map = new HashMap();
        int[] res = new int[2];
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(target - nums[i])){
                nums[0] = map.get(target - nums[i]);
                nums[1] = i;
                return res;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
