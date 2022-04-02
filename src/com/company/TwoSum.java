package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {2,3,4};
        int k = 6;
        System.out.println(Arrays.toString(twoSum(arr,k)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] res = new int[2];
        while(i < j){
            if(numbers[j] + numbers[i] == target) {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            else if(numbers[j] + numbers[i] > target) j--;
            else i++;
        }
        return res;
//        HashMap<Integer ,Integer> map = new HashMap();
//        int[] res = new int[2];
//        for(int i = 0; i< nums.length; i++){
//            if(map.containsKey(target - nums[i])){
//                nums[0] = map.get(target - nums[i]);
//                nums[1] = i;
//                return res;
//            }
//            else{
//                map.put(nums[i], i);
//            }
//        }
//        return res;
    }
}
