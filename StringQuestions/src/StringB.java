import java.util.Scanner;

public class StringB {
    public static void main(String[] args) {
        //reverse a string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st = sc.next();

        StringBuilder s = new StringBuilder(st);
        char front;
        char back;
        for (int i = 0; i < s.length()/2; i++) {
            front = s.charAt(i);
            back = s.charAt(s.length()-i-1);
            s.setCharAt(i, back);
            s.setCharAt(s.length()-i-1, front);
        }
        System.out.println(s);

    }
}
