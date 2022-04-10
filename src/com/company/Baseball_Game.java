package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        Stack<Integer> s = new Stack<>();
        for (String op : ops) {

            if(op.equals("C")){
                s.pop();
            }
            else if(op.equals("D")){

                s.push(s.peek() * 2);
            }
            else if(op.equals("+")){
                int x = s.pop();
                int y = x + s.peek();
                s.push(x);
                s.push(y);
            }
            else{
                s.push(Integer.valueOf(op));
            }
            System.out.println(s.peek());

        }
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        System.out.println(sum);
    }


}
