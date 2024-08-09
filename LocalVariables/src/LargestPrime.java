public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        if (number <= 3) {
            return number;
        }
        int lPrime = 0;
        //boolean isPrime = false;
        boolean a = false;
        for (int i = 1; i <= number; i++) {
            if(i==number && lPrime>0){
                return lPrime;
            }
            if (number % i == 0) {


                for(int divisor=2;divisor<=i;divisor++){
                    if(i % divisor == 0){
                        a= true;
                    }
                    else{
                        a =  false;
                    }
                    if(a){
                        lPrime = i;
                    }
                }

            }


        }
        return lPrime;
    }
}
// public static boolean isPrime(int wholeNumber){
//     for(int divisor=2;divisor<=wholeNumber/2;divisor++){
//         if(wholeNumber % divisor == 0){
//             return false;
//         }
//     }
//     return true;


// }
