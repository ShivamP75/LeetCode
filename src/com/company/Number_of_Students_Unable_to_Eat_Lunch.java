package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public static void main(String[] args) {
        int[] stu = {0,0,0,1,0,1,1,1,1,0,1};
        int[] san = {0,0,0,1,0,0,0,0,0,1,0};
        System.out.println(countStudents(stu, san));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        Stack<Integer> s = new Stack<>();
        for (int i = sandwiches.length-1; i >= 0 ; i--) {
            s.push(sandwiches[i]);
        }
        int count = 0;
        while(count != q.size()){
            if(s.peek() == q.peek()){
                s.pop();
                q.remove();
                count = 0;
            }
            else{
                int a = q.remove();
                q.add(a);
                count++;
            }
        }
        return q.size();
    }
}
