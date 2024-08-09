public class neww {
    public static void main(String[] args){
        reverseNumberTrianglePattern(5);
    }
    public static void butterflyPattern(int number){
        for(int i=1;i<=number;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int k=1;k<=(number*2 - i*2);k++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=number;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int k=1;k<=(number*2 - i*2);k++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SquareFillPattern(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void rightHalfPyramid(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseNumberTrianglePattern(int number){
        for(int i = 1;i<=number;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j =i;j<=number;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=number-1;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j =i;j<=number;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void hollowTrianglePattern(int number){
        for(int i= 1;i<=number;i++){
            for(int j=number-1;j>=1;j--){

            }
        }
    }

}
