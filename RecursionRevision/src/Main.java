import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        printFibonacci(0,1,5);
        System.out.println(xpownLogn(2,100));
    }

    public static void fiveToOne(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        fiveToOne(num-1);
//        System.out.println(num);
    }

    public static void printSum(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum += num;
        printSum(num-1,sum);

    }

    public static int dwprintSum(int num){

        if(num==1){
            return 1;
        }


        return num + dwprintSum(num-1);
    }

    public static int printFact(int num){

        if(num==1 || num==0){
            return 1;
        }

        return num * printFact(num-1);
    }

    public static void printFibonacci(int a, int b, int num){

        if(num==0){
            return;
        }

        System.out.println(a);
        printFibonacci(b,a+b,num-1);

    }

    public static int xpown(int num, int pow){
        if(pow == 0 || num == 1 || num ==0){
            return 1;
        }
        return num * xpown(num,pow-1);
    }

    public static BigInteger xpownLogn(int num, int pow){

        //used BigInteger instead of int and long
        if(pow == 0 || num == 1 || num ==0){
            return BigInteger.ONE;
        }

        if(pow%2 == 0){
            return xpownLogn(num, pow/2).multiply(xpownLogn(num,pow/2));
        }
        else{ // pow%2 !=0
            return xpownLogn(num, pow/2).multiply(xpownLogn(num,pow/2)).multiply(BigInteger.valueOf(num));
        }

    }

}