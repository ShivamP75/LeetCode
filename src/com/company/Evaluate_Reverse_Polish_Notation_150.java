package com.company;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {
    public static void main(String[] args) {
        String[] arr = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(arr));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for(int i = 0;i<tokens.length;i++){
            String str = tokens[i];
            if(str.equals("+")){
                int x = s.pop();
                int y = s.pop();
                s.push(x + y);
            }else if(str.equals("-")){
                int x = s.pop();
                int y = s.pop();
                s.push(y - x);
            }else if(str.equals("*")){
                int x = s.pop();
                int y = s.pop();
                s.push(x * y);
            }else if(str.equals("/")){
                int x = s.pop();
                int y = s.pop();
                s.push(y / x);
            }else{
                s.push(Integer.valueOf(str));
            }
        }
        return s.pop();
    }
}
