//package com.company;
//
//public class Search_a_2D_Matrix {
//    public static void main(String[] args) {
//       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//       int k = 3;
//        System.out.println(searchMatrix(matrix, k));
//    }
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        int low = 0;
//        int high = matrix.length-1;
//        int findInd = 0;
//        while(low <= high){
//            int mid = low + (high - low)/2;
//            if(matrix[mid][0] == target) return true;
//            if((matrix[mid][0]) > target && matrix[matrix[mid].length-1] ) high = mid -1;
//            else low = mid+1;
//        }
//        System.out.println(low);
//    return true;
//    }
//}
