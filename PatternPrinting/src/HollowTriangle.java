public class HollowTriangle {
    public static void main(String[] args){
        //printPattern(6);
        ht(6);
    }
    public static void ht(int number){
        int space = 1;
        System.out.println();
        for(int i = 1;i<=number;i++){
            //spaces
            for(int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            if(i==1){

                System.out.print("*");
            }
            if (i > 1 && i < number) {
                System.out.print("*");
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                space+=2;
            }
            if(i==number){
                for (int j = 1; j <=number*2-1 ; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
