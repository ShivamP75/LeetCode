package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaxVal {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 1;
        int mod = 1000000007;
//        6 4
//        1 5 2 3 6 4
        int mul = 1;
        for (int i = 0; i < n; i++) {

            if (i < k) {
                int num = sc.nextInt();
                dq.add(num);
                int num1 =dq.remove();
                if (num1 > max) max = num1;
            }
            if(i == k -1){
                mul = ((mul%mod) * (max%mod))%mod;
            }
            if( i == k){
                int num = sc.nextInt();
                dq.add(num);
                int num1 =dq.remove();
                if(num1 > max) max = num1;
                else max = 1;
            }
            if(i > k){
                int num = sc.nextInt();
                dq.add(num);
                int num1 =dq.remove();

                if (num1 > max) max = num1;
                mul = ((mul%mod) * (max%mod))%mod;
            }


        }
        System.out.println(mul);
    }
}
