import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        String t = "";
//        System.out.println(s.replaceAll("e","i"));

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='e'){
                t += "i";
            }else{
                t += s.charAt(i);
            }
        }
        System.out.println(t);

    }
}
