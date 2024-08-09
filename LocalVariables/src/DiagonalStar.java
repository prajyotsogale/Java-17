public class DiagonalStar {
    public static void main(String[] args){
        printSquareStar(5);
    }
    // write code here
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
            return;
        }

        int remaining = number -2;
        int space = 0;
        for(int rows = 1; rows<=remaining; rows++){
            System.out.print("*");
            //for(int line =1; line<=remaining; line++ ){
            for(int k = 1;k<=space;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int middlesapce = 1; middlesapce<=number-4;middlesapce++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 1;k<=space;k++){
                System.out.print(" ");
            }
            System.out.println("*");
            space+=1;
            //}


        }

    }

}
