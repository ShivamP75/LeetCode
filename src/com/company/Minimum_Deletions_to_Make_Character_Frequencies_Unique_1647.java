package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class Minimum_Deletions_to_Make_Character_Frequencies_Unique_1647 {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        System.out.println(minDeletions(str));
    }
    public static int minDeletions(String s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] charFreq = new int[26];
        for(int i = 0;i<s.length();i++){
            charFreq[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i<charFreq.length;i++){
            if(charFreq[i] > 0){
                pq.add(charFreq[i]);
            }
        }
        int count = 0;
        while(pq.size() > 1){
            int top = pq.poll();
            if(top == pq.peek()){
               if(top - 1 > 0){
                   pq.add(top - 1);
               }
                count++;

            }

        }
        return count;
    }
}
