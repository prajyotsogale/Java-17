import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min=0,max=0,chk=0;
        boolean isValid = true;
        do{
            System.out.println("Type number to find OR type any charac to quit!");
            try{
                chk = Integer.parseInt(sc.nextLine());
                if(chk<min||(min==0&&max==0)){
                    min= chk;
                }
                if(chk>max){
                    max=chk;
                }
                System.out.println("Minimum: "+min+" Maximum: "+max);
            }catch(NumberFormatException e){
                isValid=false;
                System.out.println("Minimum: "+min+" Maximum: "+max);
            }
        }while(isValid);


    }
}
