import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a^b;
        b = a^b;
        a = a^b;

        //array

        int[] arr = {3,4,5,6,7,8};

        arr[0] = arr[0]^arr[1];
        arr[1] = arr[0]^arr[1];
        arr[0] = arr[0]^arr[1];
        System.out.println(Arrays.toString(arr));

    }
}
