public class StackHeight {
    public static void main(String[] args) {
        System.out.println(calculatePow(2,5));
    }
    public static int calculatePow(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
//        int xpownm1 = calculatePow(x,n-1);
//        int xpown = x*xpownm1;
//
//        return xpown;

        if(n%2 == 0){
            return calculatePow(x,n/2) *calculatePow(x,n/2);
        }else{ //n is odd
            return calculatePow(x,n/2) *calculatePow(x,n/2) *x;
        }

    }
}
