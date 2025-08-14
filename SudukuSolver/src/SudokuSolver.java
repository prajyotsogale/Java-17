import java.util.Arrays;


public class SudokuSolver {
    public static void main(String[] args){
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudokuSolver(board, 0,0);
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col){
        if( row == sudoku.length){
            System.out.println(Arrays.deepToString(sudoku));
            System.out.println("first Solution ended");
            return true;
        }
         for(; col<9; col++){
            for(int num = 1;num<10;num++){
                if(isSafe(sudoku, num, row, col)){
                    sudoku[row][col] = num;
                    if(sudokuSolver(sudoku, row, col+1)){
                        return true;
                    }
                    sudoku[row][col] = 0;
                }
            }
        }
        sudokuSolver(sudoku, row+1, col);
        return false;
    }

    public static boolean isSafe( int[][] sudoku, int num, int row, int col){
        //check row
        for(int i=0;i<9;i++){
            if(sudoku[row][i] == num){
                return false;
            }
        }
        //check column
        for(int i=0;i<9;i++){
            if(sudoku[i][col] == num){
                return false;
            }
        }
        //check its matrix
        for(int startRow = row - row%3; startRow<row - (row%3) +3;startRow++){
            for(int startCol = col - col%3;startCol<col - (col%3)+3;startCol++){
                if(sudoku[startRow][startCol] == num){
                    return false;
                }
            }
        }
        return true;

    }
}
