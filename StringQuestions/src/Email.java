import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email : ");
        String s = sc.next();
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='@'){
                //i=s.length();
                //return;
                break;
            }else {
                t += s.charAt(i);
            }
        }
        System.out.println("Enter your username is : ");
        System.out.print(t);
    }
}
