package Patterns.Questions;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        boolean b = true;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(b?1:0);
                b = !b;
            }
            System.out.println();
        }

        //a different approach

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value : ");
//        int a = sc.nextInt();
//
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= i; j++) {
//                if((i+j)%2==0){
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
        
    }
}
