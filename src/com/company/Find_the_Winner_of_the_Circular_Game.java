package com.company;


import java.util.ArrayDeque;
import java.util.Queue;

public class Find_the_Winner_of_the_Circular_Game {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));

     }
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        int count = 1;
        while(q.size() != 1){
            if(count % k == 0){
                q.remove();
                count++;
            }
            else{
                count++;
                int a = q.remove();
                q.add(a);
            }

        }
        return q.peek();
    }

}
