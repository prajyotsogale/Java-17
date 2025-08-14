import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        findSubset(3, arr);
    }

    public static void findSubset(int n, ArrayList<Integer> arr){

        if(n==0){
            System.out.println(arr);
            return;

        }


        //to be
        arr.add(n);
        findSubset(n-1,arr);
        // or not to be
        arr.remove(arr.size() -1);
        findSubset(n-1,arr);
    }
}
