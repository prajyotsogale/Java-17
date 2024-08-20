import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println("after change " +
                "to myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after change " +
                "to anotherArray = "+Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] arr){
        arr[1] = 22;
    }
}