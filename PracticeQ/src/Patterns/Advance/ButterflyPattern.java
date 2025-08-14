package Patterns.Advance;

public class ButterflyPattern {
    public static void main(String[] args) {
        butterflyPattern(4);
    }

    public static void butterflyPattern(int a){
        //upper part
        for (int i = 1; i <= a; i++) {
            
            //first part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            //spaces
            for (int j = 0; j < 8-(i*2); j++) {
                System.out.print(" ");
            }
            //last half
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            
            System.out.println();
            
        }

        for (int i = a; i >= 1; i--) {

            //first part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < 8-(i*2); j++) {
                System.out.print(" ");
            }
            //last half
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }


            System.out.println();

        }
        
    }
}
