import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        int[][] arr= new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter the number at index %d,%d : ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        System.out.println("Enter the number to search : ");
        int num = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]== num){
                    System.out.printf("%d is at index %d,%d ",num,i,j);
                }
            }
        }
    }
}
