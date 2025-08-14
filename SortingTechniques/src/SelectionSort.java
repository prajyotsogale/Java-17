import java.util.Arrays;

public class SelectionSort {

    //one swap per iteration

    public static void main(String[] args) {
        int temp;
        int arr[] = {7,8,3,1,2};
        int smallest;
        for (int i = 0; i < arr.length; i++) {
            smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
