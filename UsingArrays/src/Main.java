import java.util.Arrays;
import java.util.Random;

//working with arrays

public class Main {
    public static void main(String[] args) {
        int[] newArray = getRandomArray(10);
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,3);
        System.out.println(Arrays.toString(secondArray));

        //using Arrays.copyof()
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println();
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Able","John","Mark","Tony","Bruce"};
        System.out.println(Arrays.toString(sArray));
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
//        System.out.println(Arrays.binarySearch(sArray,"Mark"));
        if(Arrays.binarySearch(sArray,"Mark")>=0){
            System.out.println("Found match in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
        System.out.println("when equal sign is used");
        if(s1==s2){
            System.out.println("(== sign)Arrays are equal");
        }else{
            System.out.println("(== sign)Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i=0;i<newInt.length;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}