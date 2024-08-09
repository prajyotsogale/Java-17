public class WhileChallege {
    public static void main(String[] args){

        int i = 4;
        int totalEven = 0;
        int totalOdd = 0;

        while (i<=20){
            i++;
//            if(totalEven ==5){
//                System.out.println("Total Even numbers: "+totalEven);
//                System.out.println("Total odd numbers: "+totalOdd);
//                break;
//            }
            if(!isEven(i)){
                totalOdd+=1;
                continue;
            }
            totalEven +=1;
            System.out.println(i);
            if(totalEven ==5){
                System.out.println("Total Even numbers: "+totalEven);
                System.out.println("Total odd numbers: "+totalOdd);
                break;
            }

        }



    }

    public static boolean isEven(int number){
        return (number%2==0);
    }



}
