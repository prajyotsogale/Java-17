public class Challenge {
    public static void main(String[] args){
        for(double i =7.5; i<=10;i+=0.25){
            System.out.println("100 dollars at "+i+"% interest rate is "+
                    calculateInterest(100,i));
            if(i>=8){
                break;
            }
        }
    }
    public static double calculateInterest(double amount,double interest){

        return (amount*(interest/100));
    }
}
