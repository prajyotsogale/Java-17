import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings : ");
        int num = sc.nextInt();
        int length = 0;
        String[] s = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the String : ");
            s[i] = sc.next();
            length += s[i].length();
        }
        System.out.println(Arrays.toString(s));
        System.out.println(length);
    }
}