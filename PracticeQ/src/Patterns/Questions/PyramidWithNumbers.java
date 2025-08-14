package Patterns.Questions;

import java.util.Scanner;

public class PyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < i+2; j++) {
                System.out.printf(" %d ",j);
            }
            System.out.println();
        }
    }
}
