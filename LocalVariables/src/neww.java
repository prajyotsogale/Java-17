public class neww {
    public static void main(String[] args){
        System.out.println(largestPrime(45));
    }

    public static int largestPrime(int number){
        boolean isprime = false;
        int lprime = 0;
        for(int i=2; i<=number/2;i++){
            if(number%i==0){
                //check if i is prime
                for(int divisor=2; divisor<=i-1;divisor++){
                    if(i%divisor==0){
                        isprime = false;
                        break;
                    }
                    isprime = true;
                }
                if(isprime){
                    lprime = i;
                }
            }
        }
        if(lprime==0){
            lprime = number;
        }
        return lprime;
    }
}
