import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Array before = "+Arrays.toString(arr));
        arr = reverse(arr);
        System.out.println("Array after = "+Arrays.toString(arr));
    }
    private static int[] reverse(int[] arr){
        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1-i];
            arr[arr.length -1-i] = temp;
        }
        return arr;
    }
    private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}