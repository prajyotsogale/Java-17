import java.util.Scanner;
public class revided {
    public static void main(String[] args){
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        double j = 0;
        double sum = 0;

        while(counter<=5){
            System.out.println("Enter "+counter+": ");
            try{
                j = Double.parseDouble(sc.nextLine());
                sum+=j;
                //System.out.println(sum);
                counter++;
            }catch(NumberFormatException prajyot){
                System.out.println("Characters not allowed! Try again"+prajyot.getMessage());
            }


        }
        System.out.println(sum);
    }
}
