package com.company;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(diagonalSum(mat));

        int[][] accounts = {{1,2,3},{4,5,6}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[0].length;j++){
                sum += accounts[i][j];
            }
            maxWealth = Math.max(sum , maxWealth);
        }
        return maxWealth;
    }

    public static int diagonalSum(int[][] mat) {
        int leftDiagonalI = 0;
        int leftDiagonalJ = 0;
        int rightDiagonalI = 0;
        int rightDiagonalJ = mat[0].length-1;
        int sum = 0;
        int totalRows = mat[0].length;
        int middlerowAndCol = mat[0].length/2;
        while(leftDiagonalI < totalRows){
            sum += mat[leftDiagonalI][leftDiagonalJ];
            leftDiagonalI++;
            leftDiagonalJ++;
        }
        while (rightDiagonalI < totalRows) {
            if(rightDiagonalI == middlerowAndCol && rightDiagonalJ == middlerowAndCol){
                rightDiagonalI++;
                rightDiagonalJ--;
                continue;
            }
            sum += mat[rightDiagonalI][rightDiagonalJ];
            rightDiagonalI++;
            rightDiagonalJ--;
        }
        return sum;
    }
}
