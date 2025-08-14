public class Main {
    public static void main(String[] args) {
        printSum(30);
    }
    public static void factorial(int n){
        int f=1;
        for (int i = 1; i <=n ; i++) {
            f*=i;
        }
        System.out.println(f);
    }

    public static void product(int a, int b){
        System.out.println(a*b);
    }

    public static void printSum(int n){
        int sum = 1;
        for (int i = 1; i <n;i+=2) {
            sum+=i;
            System.out.println(sum);
        }
    }
}