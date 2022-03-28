package com.company;
import java.util.*;
public class Threeum {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        List<List<Integer>> res= threeSum(arr);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
/*
   [ -1 , 0 , -1 , 1 ,2 ,4]
 */
            int Y = i+1;
            int Z = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(Z > Y){
                int sum = nums[i] + nums[Y] + nums[Z];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[Y], nums[Z]));
                    Z--;
                }
                else if(sum > 0) Z--;
                else Y++;
            }
        }
        return res;
    }
}
