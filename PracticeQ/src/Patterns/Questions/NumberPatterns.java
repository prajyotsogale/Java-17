package Patterns.Questions;

public class NumberPatterns {
    public static void main(String[] args) {
        pyramid(5);
    }

    public static void number(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }

    public static void pyramid(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
