import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        int[][] transpose = new int[rows][col];
        int[][] matrix = new int[rows][col];
        matrix[0][0] = 1;matrix[0][1] = 5;matrix[0][2] = 7;
        matrix[1][0] = 6;matrix[1][1] = 10;matrix[1][2] = 12;
        matrix[2][0] = 9;matrix[2][1] = 25;matrix[2][2] = 29;


        System.out.println("Before swap ");
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("After swap");
        System.out.println(Arrays.deepToString(transpose));
    }
}
