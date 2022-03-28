package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 0, 0};
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] arr) {
        int[] res = new int[arr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

        }
        int i = 0;
        while (pq.size() > 0) {
            res[i] = pq.poll();
            i++;
        }
        return res;
    }
}
