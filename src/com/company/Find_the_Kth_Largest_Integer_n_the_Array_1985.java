package com.company;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class Find_the_Kth_Largest_Integer_n_the_Array_1985 {
    public static void main(String[] args) {
        String[] s = {"2","21","12","1"};
        int k = 3;
        System.out.println(kthLargestNumber(s, k));
    }
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> a.length() == a.length() ? a.compareTo(b) : a.length() - b.length());
        for(String s : nums){
            pq.add(s);
        }
        while(k > 1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}
