public class Main {
    public static void main(String[] args) {
        System.out.println(mazePath(0,0,3,3));
    }

    public static void permutations(String string, String newString, int index){

        if(string.isEmpty()){
            System.out.println(newString);
            return;
        }

        for (int i = 0; i <string.length(); i++) {
            char currentChar = string.charAt(i);
            String newStr = string.substring(0,i)+string.substring(i+1);
            permutations(newStr, newString+currentChar, index+1);
        }
    }

    public static int mazePath(int i, int j, int m, int n){
        if(i==m-1 || j==n-1){
            return 1;
        }
        if(i==m  && j==n){
            return 1;
        }

        //go right
        int rightPaths = mazePath(i+1,j,m,n);
        //go down
        int downPaths = mazePath(i,j+1,m,n);

        return rightPaths+downPaths;
    }
}