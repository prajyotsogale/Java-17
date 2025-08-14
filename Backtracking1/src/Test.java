import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        queensProblem(board,allBoard,n,0);
        return allBoard;
    }
    public static void queensProblem(char[][] board,List<List<String>> allBoard, int n, int col){
        if(col == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row=0;row<board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                queensProblem(board,allBoard, n, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        //vertical
        for(int i=0; i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upper right
        for(int i=row,j=col;i>=0 && j < board.length ;i--,j++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upper left
        for(int i=row,j=col;i>=0 && j >=0 ;i--,j--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //lower right
        for(int i=row,j=col;i <board.length && j < board.length ;i++,j++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //lower left
        for(int i=row,j=col;i<board.length && j >= 0 ;i++,j--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoard){
        List<String> littleBoard = new ArrayList<>();
        String row;
        for(int i =0; i<board.length;i++){
            row = "";
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 'Q'){
                    row += "Q";
                }
                else{
                    row += ".";
                }
            }
            littleBoard.add(row);
        }
        allBoard.add(littleBoard);
    }
}
