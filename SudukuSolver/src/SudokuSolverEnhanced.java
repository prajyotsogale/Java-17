import java.util.Arrays;

public class SudokuSolverEnhanced {
    public static void main(String[] args){
        char[][] sudokuBoard = {
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


        sudokuSolver(sudokuBoard,0,0);
    }
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        //column
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == (char)(number+'0')) {
                return false;
            }
        }

        //row
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == (char)(number+'0')) {
                return false;
            }
        }

        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);

        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] == (char)(number+'0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(char[][] sudoku, int row, int col){
        if(row == sudoku.length){
            System.out.println(Arrays.deepToString(sudoku));
            return true;
        }

        int newRow = 0;
        int newCol = 0;
        if(col != sudoku.length-1){
            newRow = row;
            newCol = col+1;
        }
        else{
            newRow = row+1;
            newCol = 0;
        }

        if(sudoku[row][col] != '.'){
            if(sudokuSolver(sudoku,newRow, newCol)){
                return true;
            }
        }
        else{
            for(int i=1;i<10;i++){
                if(isSafe(sudoku, row, col, i)){
                    sudoku[row][col] = (char)(i+'0');
                    if(sudokuSolver(sudoku,newRow, newCol)){
                        return true;
                    }else{
                        sudoku[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
}
