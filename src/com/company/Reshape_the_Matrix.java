package com.company;

public class Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int[][] res = matrixReshape(mat, 1, 4);
        for(int i = 0; i< res.length; i++){
            for (int j = 0; j < res[0].length; j++) {
                System.out.println(res[i][j]);
            }
        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;
        int a = 0;
        int b = 0;
        int[][] newMat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (b < n) {
                    newMat[i][j] = mat[a][b];
                    b++;
                } else {
                    a++;
                    b = 0;
                    newMat[i][j] = mat[a][b];
                    b++;
                }
            }
        }
        return newMat;
    }
}
