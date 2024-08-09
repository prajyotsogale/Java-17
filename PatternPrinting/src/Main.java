public class Main {
    public static void main(String[] args){

    }

    public static void numberFour(int number){
        int k = number;
        for (int i = 1; i <=number ; i++) {
            for (int j =1; j <=k ; j++) {
                System.out.print(j+" ");

            }
            k--;
            System.out.println();
        }
    }

    public static void numberFive(int number){
        int value = 1;
        for(int i=1 ; i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }

    public static void numberSix(int number){
        //int value = 1;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
                //value++;

            }System.out.println();
        }
    }


    public static void numberSeven(int number){
        for (int i = 1; i <=number; i++) {
            for (int j = 1; j <= number-i; j++) {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void rhombusPattern(int number){
        for (int i = 0; i <=number ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }System.out.print("* * * *");
            System.out.println();
        }
    }

    public static void diamondPattern(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("  * ");
            }
            System.out.println();
        }
        for(int i = number-1;i>=1;i--){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print("  * ");
            }
            System.out.println();
        }
    }



}