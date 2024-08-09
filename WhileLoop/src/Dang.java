public class Dang {

    public static void main(String[] args){



        System.out.println(sumDigits(125));
        System.out.println(sumDigits(100));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-567));
        System.out.println(sumDigits(87654321));
    }

    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int digitValue = 0;
        int sum = 0;
        int n = 10;

        while(number!=0){

            digitValue = number%n;
            sum +=digitValue;
            number /=10;


        }
        return sum;
    }



}
