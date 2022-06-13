package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Min_Max_Game_2293 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }
    public static int minMaxGame(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        for(int i : nums){
            q.add(i);
        }
        while(q.size() != 1){
            int size = q.size();
            int count = 0;
            for(int i = 0;i<size/2;i++){
                if(count % 2 == 0){
                    int x = q.poll();
                    int y = q.poll();
                    q.add(Math.min(x, y));
                }
                else{
                    q.add(Math.max(q.poll(), q.poll()));
                }
                count++;
            }
        }
        return q.poll();
    }
}
