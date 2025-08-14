import java.util.ArrayList;
import java.util.Arrays;

public class TilesProblem {
    public static void main(String[] args) {
        //place 1xm tiles to nxm
//        System.out.println(placeTiles(4,2));


//        System.out.println(friendsProblem(4));
        ArrayList<Integer> arr = new ArrayList<>();
        printSubset(4,arr);
    }
    public static int placeTiles(int n, int m){
      if(n < m){
          return 1;
      }
      if(n==m){
          return 2;
      }
      int vertical = placeTiles(n-1,m);
      int horizontal = placeTiles(n-m,m);
      return vertical + horizontal;
    }
    public static int friendsProblem(int n){
        if(n<=1){
            return 1;
        }

        int single = friendsProblem(n-1);
        int pair = friendsProblem(n-2);
        return single+pair;
    }

    public static void printSubset(int n, ArrayList<Integer> arr){
        if(n==0){
            System.out.println(arr);
            return;
        }
        // to be in the subset
        arr.add(n);
        printSubset(n-1,arr);
        // not to be
         arr.remove(arr.size()-1);
         printSubset(n-1,arr);
    }
}
