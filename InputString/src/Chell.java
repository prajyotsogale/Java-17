import java.util.Scanner;
public class Chell {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int inpt = 0;
        int sum = 0;
        long avg = 0l;
        int counter = 1;
        try{
            inpt = Integer.parseInt(sc.nextLine());
            sum+=inpt;
            avg = sum/counter;
            counter++;
        }catch(NumberFormatException e){
            System.out.println("SUM = "+sum+" AVG = "+avg);
        }
    }
}
