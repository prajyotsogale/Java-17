public class Main {
    public static void main(String[] args) {
//        permutations("abc","");
        System.out.println(mazePath(0,0,3,3));
    }

    public static void permutations(String string, String permutation){
        if(string.length() == 0){
            System.out.println(permutation);
            return;
        }

        char currentCharacter;
        String newStr;

        for (int i = 0; i <string.length(); i++) {
           currentCharacter = string.charAt(i);
           newStr = string.substring(0,i)+string.substring(i+1);
           permutations(newStr, permutation+currentCharacter);
        }
    }

    public static int mazePath(int i, int j, int n, int m){

        if(i==n || j==m){
            return 0;
        }
        if(i == n-1 && j==m-1){
            return 1;
        }
        //first choice  right

        int rightPath = mazePath(i,j+1,n,m);

        //second choice  downwards

        int downPath = mazePath(i+1,j,n,m);

        return downPath+rightPath;

    }


}