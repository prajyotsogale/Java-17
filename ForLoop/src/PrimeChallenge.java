public class PrimeChallenge {
    public static void main(String[] args){
        int counter = 0;
        for(int i=0; counter <3 && i<=1000; i++){
//            if(counter == 3){
//                System.out.println("counter is "+counter+" so i exitted");
//                break;
//            }
//            else{
                if(isPrime(i)){
                    counter +=1;
                    System.out.println(i+" is a prime number");
//                }
            }
        }


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
