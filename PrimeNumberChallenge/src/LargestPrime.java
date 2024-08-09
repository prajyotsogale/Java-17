public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(33));
    }

    public static int getLargestPrime(int number){
        if(number<0){
            return -1;
        }
        int flag = 0;
        for(int i=number/2;i>=0;i--){
            if(number%i==0){
                if(isPrime(i)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }
        for(int divisor=2;divisor<=wholeNumber/2;divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}