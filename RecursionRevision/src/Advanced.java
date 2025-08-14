import java.util.ArrayList;

public class Advanced {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        subsetOfNaturalNumbers(3,arr);
    }
    public static void printPermutations(String string, int index, String perm){
        if(string.isEmpty()){
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            String newString = string.substring(0,i)+string.substring(i+1);
            char currentChar = string.charAt(i);
            printPermutations(newString,index+1,perm+currentChar);
        }
    }

    public static int totalPaths(int i, int j, int m, int n){
        if(i==m-1 || j == n-1){
            return 1;
        }

        //go right
        int rightPath = totalPaths(i+1,j,m,n);
        //go down
        int downPath = totalPaths(i,j+1,m,n);

        return downPath+rightPath;
    }

    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        return placeTiles(n-m,m)+ placeTiles(n-1,m);
    }

    public static int partyWays(int n){
        if(n<=1){
            return 1;
        }
        //single
        int singleWay = partyWays(n-1);
        //pair
        int pairWay = (n-1)*partyWays(n-2);

        return singleWay+pairWay;
    }

    public static void subsetOfNaturalNumbers(int num, ArrayList<Integer> arr){

        if(num == 0){
            System.out.println(arr);
            return;
        }

        //to be
        arr.add(num);
        subsetOfNaturalNumbers(num-1,arr);
        // or not to be
        arr.remove(arr.size()-1);
        subsetOfNaturalNumbers(num-1,arr);
    }
}
