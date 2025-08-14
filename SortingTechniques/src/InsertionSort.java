import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int current;
        int j;
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            j = i-1;
            while( j>=0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
            System.out.println(Arrays.toString(arr));
        }

    }
}
