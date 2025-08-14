public class fibonacciSeries {
    public static void main(String[] args) {
//        System.out.println(0);
//        System.out.println(1);
//        calculateSeries(0,1,5);

        System.out.println(calcPower(2,5));
    }
    public static void calculateSeries(int a, int b, int num){
        if(num==0){
            return;
        }


        int c = a+b;
        System.out.println(c);
        calculateSeries(b,c,num-1);
    }


    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownm1 = calcPower(x,n-1);
        int xpown = x*xpownm1;

        return xpown;
    }
}
