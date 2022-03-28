package com.company;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public  static int removeDuplicates(int[] nums) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//
//        for(int i = 0;i < nums.length; i++){
//            if(hm.containsKey(nums[i])) continue;
//            hm.put(nums[i], 1);
//        }
//        for(Map.Entry<Integer, Integer> map = hm.entrySet()){
//
//        }
//        return hm.size();
        HashMap<Integer, Float> hm = new HashMap<>();
        for(int i = 0; i <nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1f);
            }
            else{
                hm.put(nums[i], 1f);
            }
        }
        for(Map.Entry <Integer, Float> entry : hm.entrySet()){
            if(entry.getValue() >= (float)(nums.length/2.0)){
                return entry.getKey();
            }
        }
        return -1;
    }
}
