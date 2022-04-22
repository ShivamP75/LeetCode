package com.company;

import java.util.Stack;

public class Make_The_String_Great_1544 {
    public static void main(String[] args) {
        String s = "Pp";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        if(s.length() == 1) return s;
        return goodString(s);
    }

    public static String goodString(String s){
        Stack<Character> stack = new Stack<>();

        int ci = 1;
        stack.push(s.charAt(0));
        while(ci < s.length()){
            if(s.charAt(ci) >= 65 && s.charAt(ci) <= 90){
                if(!stack.isEmpty() && (stack.peek() - 'a' + 'A' == s.charAt(ci))){
                    ci++;
                    stack.pop();
                }
                else stack.push(s.charAt(ci++));
            }
            else if(s.charAt(ci) >= 97 && s.charAt(ci) <= 122){
                if(!stack.isEmpty() && (stack.peek() + 'a' - 'A' == s.charAt(ci))){
                    ci++;
                    stack.pop();
                }
                else stack.push(s.charAt(ci++));
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        return String.valueOf(sb);
    }
}
