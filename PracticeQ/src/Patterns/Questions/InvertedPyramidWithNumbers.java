package Patterns.Questions;

import java.util.Scanner;

public class InvertedPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < a-i+1; j++) {
                System.out.printf(" %d ",j);
            }
            System.out.println();
        }
    }
}
