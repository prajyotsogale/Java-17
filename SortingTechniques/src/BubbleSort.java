import java.util.Arrays;
//time complexity = O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,5,6};
        boolean changed;

        for (int i = 0; i < arr.length; i++) {
            changed = false;
            for (int j = 0; j < arr.length-1; j++) {

                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                    changed = true;
                }

            }
            System.out.println(Arrays.toString(arr));
            if(changed ==  false){
                break;
            }
        }

    }
}
