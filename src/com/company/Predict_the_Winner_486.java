//package com.company;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class Predict_the_Winner_486 {
//    public static void main(String[] args) {
//        int[] nums = {1,5,233,7};
//        System.out.println(PredictTheWinner(nums));
//    }
//    public static boolean PredictTheWinner(int[] nums) {
//        ArrayDeque<Integer> q = new ArrayDeque<>();
//        for (int i = 0; i < nums.length; i++) {
//            q.add(nums[i]);
//        }
//        int player1 = 0;
//        int player2 = 0;
//        int k = 0;
//        while(!q.isEmpty()){
//            if(k % 2 == 0){
//                int x = q.peek();
//                int y = q.removeLast();
//                if(x > y){
//                    player1 += q.removeFirst();
//                    q.add(y);
//                }
//                else{
//                    player1 += y;
//                }
//                k++;
//            }
//            else{
//                int x = q.peek();
//                int y = q.removeLast();
//                if(x > y){
//                    player2 += q.removeFirst();
//                    q.add(y);
//                }
//                else{
//                    player2 += y;
//                }
//                k++;
//            }
//
//        }
//        return player1>player2 ? true : false;
//    }
//}
