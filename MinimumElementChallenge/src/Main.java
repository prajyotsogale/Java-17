import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = readInteger();
        System.out.println(Arrays.toString(a));
        System.out.println(findMin(a));

    }
    public static int[] readInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers seperated by commas : ");
        String[] st = sc.nextLine().split(",");
        int[] nums = new int[st.length];
        for (int i = 0; i <st.length ; i++) {
            nums[i] = Integer.parseInt(st[i]);
        }
        return nums;
    }
    public static int findMin(int[] arr){
//        int min = arr[0];
//        int triggered = 0;
//        while(true){
//            triggered = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i]< min){
//                    min = arr[i];
//                    triggered++;
//                }
//            }
//            if(triggered>0){
//                break;
//            }
//        }
        //Another approach is to use Array.sort() and take the first element
// Better codee ----------------------------------------------
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }



        return min;
    }
}