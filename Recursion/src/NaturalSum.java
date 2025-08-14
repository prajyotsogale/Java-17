public class NaturalSum {

    static int sum=0;
    public static void main(String[] args) {
        //print the sum of n natural numbers
        printSum(5);
    }

    public static void printSum(int num){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum +=num;
        printSum(num-1);
    }



}
