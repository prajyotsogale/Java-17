import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int marks=0;
        int enteredValue;
        boolean k;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your marks");
            k=true;
            while(k){
                enteredValue = sc.nextInt();
                if(enteredValue>100){
                    System.out.println("marks should be less than 100 enter again");
                }
                else{
                    marks += enteredValue;
                    k=false;
                }
            }
            System.out.println("Total marks = "+marks);
            System.out.println("Enter your choice 1 or 0");
            a = sc.nextInt();
        }while(a==1);
    }
}