import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to search : ");
        int num = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if(arr[i]==num){
                System.out.println("found a an index "+i);
            } else if (i==size-1) {
                System.out.println("not found");
            }
        }
    }

}