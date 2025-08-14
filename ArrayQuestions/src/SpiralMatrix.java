public class SpiralMatrix {
    public static void main(String[] args) {
        int row = 5;
        int col = 6;
        int[][] matrix = new int[5][6];
        matrix[0][0] = 1;matrix[0][1] = 5;matrix[0][2] = 7;matrix[0][3] = 9;
        matrix[0][4] = 10;matrix[0][5] = 11;
        matrix[1][0] = 6;matrix[1][1] = 10;matrix[1][2] = 12;matrix[1][3] = 13;
        matrix[1][4] = 20;matrix[1][5] = 21;
        matrix[2][0] = 9;matrix[2][1] = 25;matrix[2][2] = 29;matrix[2][3] = 30;
        matrix[2][4] = 32;matrix[2][5] = 41;
        matrix[3][0] = 15;matrix[3][1] = 55;matrix[3][2] = 59;matrix[3][3] = 63;
        matrix[3][4] = 68;matrix[3][5] = 70;
        matrix[4][0] = 40;matrix[4][1] = 70;matrix[4][2] = 79;matrix[4][3] = 81;
        matrix[4][4] = 95;matrix[4][5] = 105;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int rowStart = 0;
        int rowEnd = row-1;
        int colStart = 0;
        int colEnd = col-1;

        while (rowStart<=rowEnd && colStart<= colEnd){
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i]+" ");

            }rowStart++;
            for (int i = rowStart; i <=rowEnd ; i++) {
                System.out.print(matrix[i][colEnd]+" ");
            }colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(matrix[rowEnd][i]+" ");
            }rowEnd--;
            for (int i = rowEnd; i >=rowStart ; i--) {
                System.out.print(matrix[i][colStart]+" ");
            }colStart++;
        }
    }
}
