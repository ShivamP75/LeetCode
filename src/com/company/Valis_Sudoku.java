package com.company;

public class Valis_Sudoku {
    public static void main(String[] args) {

    }
    public static boolean validSudoku(char[][] sudoku, int n){
        if(n == 81) return true;
        int r = n/9;
        int c = n%9;
        if(sudoku[r][c]!='.'){
            if(!validElement(sudoku,r,c)){
                return false;
            }
        }
        return validSudoku(sudoku, n+1);
    }

    private static boolean validElement(char[][] sudoku, int r, int c) {
        char element = sudoku[r][c];
        for (int i = 0; i < sudoku.length; i++) {
            if(sudoku[i][c] == element && i!=r){
                return false;
            }
        }
        for (int i = 0; i < sudoku[0].length; i++) {
            if(sudoku[r][i] == element && i!=c){
                return false;
            }
        }
        int sr = r - (r%3);
        int sc = c - (c%3);
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(sudoku[i][j] == element && i!=r && j!=c){
                    return false;
                }
            }
        }
        return true;
    }
}
