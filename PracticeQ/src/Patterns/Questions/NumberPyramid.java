package Patterns.Questions;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        palindromicNumberPattern(5);
    }

    public static void starPattern(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
    public static void taken(int n){
        for (int i = 0; i < n; i++) {

            // First inner loop to print leading white spaces
            for (int j = 0; j < 2 * (n - i - 1); j++)
                System.out.print(" ");

            // Second inner loop to print star * character
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void starNumberPattern(int a){
        int k=1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf(" %d",k);
            }
            for (int j = 0; j < i ; j++) {
                System.out.printf(" %d",k);
            }
            k++;
            System.out.println();
        }

    }

    public static void palindromicNumberPattern(int a){
        int k=1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.printf(" %d",j);
            }
            for (int j = 1; j <= i ; j++) {
                System.out.printf(" %d",j);
            }
            k++;
            System.out.println();
        }
    }
}
