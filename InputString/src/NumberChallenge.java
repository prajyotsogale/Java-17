import java.util.Scanner;

public class NumberChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        boolean isValid = false;
        int total = 0;
        do {

            isValid = true;
            for(int i=1; i<=5;i++){
                System.out.println("Enter Number #"+counter+":");
                String nums = sc.nextLine();
                counter+=1;
                try{
                    int number = Integer.parseInt(nums);
                    total+=number;
                }catch(NumberFormatException e){
                    System.out.println("Characters not allowed, Try again");
                    isValid = false;
                    counter = 1;
                }

            }
        }while(!isValid);
        System.out.println("The sum of the numbers is "+total);
    }
}






