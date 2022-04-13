package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets {
    public static void main(String[] args) {
        int[] tickets = {5, 1, 1 ,1};
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets, k));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        int time = 0;
        int temp = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(k == i){
                temp = tickets[i];
                tickets[i] = -1;
            }
            q.add(tickets[i]);
        }
        while(temp != 0){
            int a = q.remove();
            if(a == -1){
                temp--;
            }
            else a--;

            if(a != 0) q.add(a);
            time++;
        }
    return time++;
    }
}
