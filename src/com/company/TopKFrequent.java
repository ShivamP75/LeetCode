package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int k = 10;
        System.out.println(Arrays.toString(topKFrequent(arr,k)));

    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }
            else{
                hmap.put(nums[i] , 1);
            }
        }
        int n = hmap.size();
        int[] arr = new int[n];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            arr[i++] = entry.getValue();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] res = new int[k];
        i = 0;
        int x = arr.length-1;
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            if(entry.getValue() == arr[x]){
                res[i++] = entry.getKey();
                x--;
                if(k == i) break;
            }
        }
        return res;
    }
}
