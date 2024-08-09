public class HollowSquare {
    public static void main(String[] args) {

    }

    public static void printHollowSquare(int number){
        for(int i =1; i<=number;i++){
            for(int j = 1; j<=number;j++){
                if(i==1){
                    System.out.print("T");
                }
                else if(i==number){
                    System.out.print("B");
                }
                else if(j==1){
                    System.out.print("L");
                }
                else if(j==number){
                    System.out.print("R");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void numberTriangle(int number){
        
        for(int i = 1;i<=number;i++){
            for(int j = 1;j<=number-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void numberThree(int number){
        for(int i =1;i<=number;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
