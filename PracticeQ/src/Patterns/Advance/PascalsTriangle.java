package Patterns.Advance;

public class PascalsTriangle {
    public static void main(String[] args) {
        taken(5);
    }
    public static void pascalsTriangle(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void taken(int a){

        int currentElement = 1;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            currentElement = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(currentElement + " ");
                currentElement = currentElement * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
