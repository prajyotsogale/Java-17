import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int currentYear = 2024;
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e){
            System.out.println(getInputFromSystem(currentYear));
        }


    }


    //Run System.console in terminal
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi "+name+",thanks for subscribing!");
        String dateOfBirth = System.console().readLine("What year you were born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are "+age+" years old";
    }
    //Run System.console in terminal

    public static String getInputFromSystem(int currentYear){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, What's your Name? ");
        String name = sc.nextLine();
        System.out.println("Hi "+name+",thanks for subscribing!");

        System.out.println("What year you were born? ");
        boolean isValid = false;
        int age = 0;
        do{
            System.out.println("Enter the date of birth between "+(currentYear-125) +" and "+(currentYear));
            try{
                age = checkData(currentYear,sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Characters are not allowed");}
            isValid = age < 0 ?false:true;

        }while(!isValid);



        return "So, you are "+age+" years old";
    }

    public static int checkData(int currentYear, String DateofBirth){
        int dob = Integer.parseInt(DateofBirth);
        int minimumYear = currentYear - 125;

        if(dob>currentYear || dob<minimumYear){
            return -1;
        }
        else{
            return (currentYear - dob);
        }
    }


}