import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        String inp;
        ArrayList<String> grocery = new ArrayList<>();
        boolean isTrue = true;
        while (isTrue){
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            System.out.println("Enter the number for which action you want to do: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextLine();
            switch(a){
                case "0"->{
                    System.out.println("case 0");
                    isTrue = false;
                }
                case "1" ->{
                    System.out.println("Enter the items to add");;
                    inp = sc.nextLine();
                    grocery.addAll(Arrays.asList(inp.split(",")));
                    grocery.sort(Comparator.naturalOrder());
                    System.out.println(grocery);
                }
                case "2" ->{
                    System.out.println("Enter the items to remove");
                    inp = sc.nextLine();
                    grocery.removeAll(Arrays.asList(inp.split(",")));
                    grocery.sort(Comparator.naturalOrder());
                    System.out.println(grocery);
                }default -> {
                    System.out.println("invalid input");
                }

            }
        }

    }
}