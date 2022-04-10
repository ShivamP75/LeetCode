package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone_Weight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        while(pq.size() != 1){
            int x = pq.poll();
            int y = pq.poll();
            pq.add(x-y);
        }
        return pq.poll();
    }
}
