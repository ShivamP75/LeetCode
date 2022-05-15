package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
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

        Pair[] arr = new Pair[hmap.size()];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
            arr[i] = new Pair(entry.getValue(), entry.getKey());
            i++;
        }

        Arrays.sort(arr);

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j].count + " " + arr[j].num);
        }

        int[] res = new int[k];
        int n = arr.length-1;
        for (int j = 0; j < res.length; j++) {
            res[j] = arr[n--].num;
        }
        return res;
    }

    static class Pair implements Comparable<Pair> {
        int count;
        int num;

        Pair(int count, int num){
            this.count = count;
            this.num = num;
        }

        @Override
        public int compareTo(Pair o) {
            return this.count - o.count;
        }
    }
}
