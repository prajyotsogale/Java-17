
public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {7,8,4,8,2,5,1};

        sort(arr, arr.length);

    }
    public static void sort(int[] arr, int n){
        if(arr.length <=1){
            return;
        }

        sort(arr,n-1);

        int last = arr[n-1];
        int j = n-2;

    }
}
