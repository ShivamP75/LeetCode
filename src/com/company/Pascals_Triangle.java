package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
    int n = 5;
    generate(n);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        res.add(arr);
        for (int i = 1; i < numRows; i++) {
            arr = new ArrayList<>();
            List<Integer> arr1 = res.get(i-1);
            for (int j = 0; j < arr1.size(); j++) {
                int left;
                int right;
                int curr;
                int sum;
                if(j == 0){
                    left = 0;
                    curr = arr1.get(j);
                    sum = left + curr;
                    arr.add(sum);
                }

                if( j > 0 && j < arr1.size()){
                    left = arr1.get(j-1);
                    curr = arr1.get(j);
                    arr.add(left + curr);
                }
                if(j == arr1.size()-1){
                    right = 0;
                    curr = arr1.get(j);
                    sum = right + curr;
                    arr.add(sum);
                }
            }
            System.out.println(arr);
            res.add(arr);
        }
        return res;
    }

}
