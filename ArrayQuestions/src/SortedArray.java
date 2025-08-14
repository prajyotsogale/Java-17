import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
