import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens_51 {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        nQueens(n,board,0);
    }

    public static void nQueens(int n, int[][] board, int row) {
        if (row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, col, row)) {
                board[row][col] = 1;

                nQueens(n, board, row + 1);

                board[row][col] = 0;
            }
        }

    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValid(int[][] board, int col, int row) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        int x = row;
        int y = col;
        // for checking in left diagonal
        while (x >= 0 && y >= 0) {
            if (board[x--][y--] == 1) {
                return false;
            }
        }
        x = row;
        y = col;

        // for checkin in right diagonal;
        while (x >= 0 && y < board.length) {
            if (board[x--][y++] == 1) {
                return false;
            }
        }
        return true;

    }


}
