package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Queue_Reconstruction_by_Height_406 {
    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(Arrays.deepToString(reconstructQueue(people)));
    }

    public static int[][] reconstructQueue(int[][] people) {
//        people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
        int[][] queue = new int[people.length][2];

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];
                }
            }
        });
        System.out.println(Arrays.deepToString(people));
        for(int[] i: people){
            Arrays.fill(i, -1);
        }
        for (int i = 0; i < people.length; i++) {
            int count = people[i][1];
            for(int j = 0;j<people.length;j++)
                if(people[j][0] == -1 && count == 0){
                    queue[j][0] = people[i][0];
                    queue[j][1] = people[i][1];
                    break;
                }
            else if(people[j][0] == -1 || queue[j][0] >= people[i][0]){
                    count -= 1;
                }
        }

        return queue;
    }
}
