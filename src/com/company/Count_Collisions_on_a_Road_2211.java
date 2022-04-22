package com.company;

import java.util.Stack;

public class Count_Collisions_on_a_Road_2211 {
    public static void main(String[] args) {
        String directions = "RLRSLL";
        System.out.println(countCollisions(directions));
    }
    public static int countCollisions(String directions) {
        Stack<Character> s = new Stack<>();

        int collide = 0;

        for(char c : directions.toCharArray()){
            if(s.isEmpty()) s.push(c);

            else{
                if(c == 'L'){
                    if(s.peek() == 'R'){
                        collide += 2;
                        s.pop();
                        while(!s.isEmpty() && s.peek() == 'R'){
                            collide++;
                            s.pop();
                        }
                        s.push('S');
                    }
                    else if(s.peek() == 'L'){
                        s.push(c);
                    }
                    else{
                        s.push('S');
                        collide++;
                    }
                }
                else if(c == 'R'){
                    s.push(c);
                }
                else{
                    while(!s.isEmpty() && s.peek() == 'R'){
                        collide++;
                        s.pop();
                    }
                    s.push(c);
                }
            }
        }

        return collide;
    }
}
