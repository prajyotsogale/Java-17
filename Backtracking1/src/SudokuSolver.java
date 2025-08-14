import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);
    }
    public static void solveSudoku(char[][] board){

        helper(board,0,0);
    }
    public static boolean helper(char[][] board, int row, int col){
        if(col== board[0].length){
            return helper(board, row+1, 0);
        }
        if(row == 9){
            System.out.println(Arrays.deepToString(board));
            return true;
        }
        if (board[row][col] != '.') {
            return helper(board, row, col + 1);
        }
        for(int num=1;num<10; num++){
            if(isSafe(board,row,col,num)){
                board[row][col] = (char)(num + '0');
                if(helper(board,row,col+1)){
                    return true;
                }else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col, int num){

        //row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == (char)(num + '0')){
                return false;
            }
        }

        // col
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == (char)(num + '0')){
                return false;
            }
        }

        //particular matrix

        int rowStart = row - row%3;
        int colStart = col - col%3;

        for (int i = rowStart; i < rowStart+3; i++) {
            for (int j = colStart; j < colStart+3; j++) {
                if(board[i][j] == (char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    }

}
