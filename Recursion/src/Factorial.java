public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        if(num==1 || num==0){
            return 1;
        }
        int factmo = factorial(num-1);
        int sum = num * factmo;
        return sum;
//        return num * factorial(num-1) ;
    }
}
