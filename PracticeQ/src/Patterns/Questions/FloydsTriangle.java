package Patterns.Questions;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        int k=1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.printf(" %d ", k);
                k++;
            }
            System.out.println();
        }

    }
}
