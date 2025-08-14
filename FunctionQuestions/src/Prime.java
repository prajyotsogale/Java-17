public class Prime {
    public static void main(String[] args) {
        checkPrime(2);
        checkPrime(3);
        checkPrime(4);
        checkPrime(17);
        checkPrime(18);
        checkPrime(19);
        checkPrime(20);
        checkPrime(29);
        checkPrime(35);
    }
    public static void checkPrime(int n){
        if(n<1){
            System.out.println("wrong");
            return;
        }
        if((n%2==0 && n!=2) || (n%3==0 && n!=3)){
            System.out.println("not prime");
            return;
        }

        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
