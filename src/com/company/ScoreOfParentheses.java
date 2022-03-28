package com.company;

import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(()(()))"));
    }

    private static int scoreOfParentheses(String s) {
        int score = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }
            else{
                if(c == ')'){
                    stack.pop();
                    if(!stack.isEmpty() && stack.peek() == '('){
                        score *= 2;
                    }
                    else score += 1;
                }
            }
        }
        return score;
    }
}
