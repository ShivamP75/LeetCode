package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision_735 {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        boolean flag = false;
        for(int i : asteroids){
            flag = false;
            while (!s.isEmpty() && i < 0 && s.peek() > 0 && !flag){
                if(s.peek() > -i){
                    flag = true;
                }
                else if(s.peek() == -i){
                    s.pop();
                    flag = true;
                }
                else{
                    s.pop();
                }
            }
            if(!flag){
                s.push(i);
            }

        }
        int[] res = new int[s.size()];
        int i = s.size()-1;
        while(!s.isEmpty()){
            res[i--] = s.pop();
        }
        return res;
    }
}
