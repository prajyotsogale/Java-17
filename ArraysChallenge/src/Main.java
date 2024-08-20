import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] rArray = generateRandomArray(10);
//        int[] re = Arrays.copyOf(rArray);
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(rArray));
        Arrays.sort(rArray);
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        System.out.println("Sorted array in ascending order");
        System.out.println(Arrays.toString(rArray));
        System.out.println("Sorted array in descending order");
        int temp;
        for (int i = 0; i < rArray.length/2; i++) {
            temp = rArray[i];
            rArray[i] = rArray[rArray.length-1-i];
            rArray[rArray.length-1-i] = temp;
        }
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(rArray));

    }
    public static int[] generateRandomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }
}