public class SumChallenge {

    public static void main(String[] args){

        //Note: The code won't provide a proper answer if the number is greater than "2147483647"
        // because the data type is int.

        System.out.println(timsCode(125));
        System.out.println(timsCode(100));
        System.out.println(timsCode(1));
        System.out.println(timsCode(567));
        System.out.println(timsCode(87654321));
    }

    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int digitValue = 0;
        int sum = 0;
        int n = 1;
        int remainder = 0;

        while(n<=number*10){
            n *=10;

            if(n>=100){

                digitValue = (number%n - remainder)*10/n;
                remainder = number%n;
                sum +=digitValue;
                continue;

            }

            digitValue = number%n;
            sum +=digitValue;
            remainder = sum;


        }
        return sum;
    }


    public static int moreEfficient(int number){
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



    public static int timsCode(int number){
        if(number<0){
            return -1;
        }

        int sum = 0;

        while(number>9){
            sum+=(number%10);
            number /=10;
        }
        sum+=number;
        return sum;
    }
}
