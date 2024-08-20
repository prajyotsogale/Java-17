import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello","World","again");

        System.out.println("_".repeat(20));
        printText();

        //java uses variable arguments in string.join
        String[] sArray = {"first","second","third","forth","fifth"};
        System.out.println(String.join(",",sArray));
    }

    public static void printText(String... textList){
        for(String t:textList){
            System.out.println(t);
        }
    }
}