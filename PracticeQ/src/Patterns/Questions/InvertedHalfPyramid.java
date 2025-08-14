package Patterns.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
