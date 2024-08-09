public class Main{
    public static void main(String[] args){
        for(int count = 1;count<=5;count++){
            System.out.println(count);
        }
        System.out.println("10,000 at 2% interest is "+calculateInterest(10000,2));
        System.out.println("10,000 at 2% interest is "+calculateInterest(10000,3));
        System.out.println("10,000 at 2% interest is "+calculateInterest(10000,4));
        System.out.println("10,000 at 2% interest is "+calculateInterest(10000,5));

        for(double i = 2;i<=20;i++){
            System.out.println("10,000 at"+ i+"% interest is "+calculateInterest(10000,i));
        }
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}