import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,1,7,8,5,3};
        int[] sumArr = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            sumArr[i] = sum;
        }
        System.out.println(Arrays.toString(sumArr));
        sum=0;
        for (int i = 2; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }



}