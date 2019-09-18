package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] cols = new boolean[9][9];
        boolean[][] rows = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        int num;
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] >= '1' && board[i][j] <= '9'){
                    num = board[i][j] - '1';
                    // Record cols
                    if(cols[j][num] || rows[i][num] || boxes[j/3 + (i/3)*3][num])
                        return false;
                    cols[j][num] = true;
                    rows[i][num] = true;
                    boxes[j/3 + (i/3)*3][num] = true;
                }
            }
        }
        return true;
    }

    public static void print(String name, boolean[][] arr) {
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(name + "-" + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j + "-" + arr[i][j] + ", ");
            }
            System.out.println("---");
        }
    }


    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};




    }



}
