public class SortedArray {
    public static void main(String[] args) {
//        int[] arr = {1,3,2,5};
//        System.out.println(checkSorted(arr,0));
        addx("axbc xxd",0,0,"");
    }
    public static boolean checkSorted(int[] arr, int indx){
        //check if an array is sorted (strictly increasing)
        if(indx == arr.length-1){
            return true;
        }
        if(arr[indx]<arr[indx+1]){
            return checkSorted(arr,indx+1);
        }else{
            return false;
        }
    }

    public static void addx(String str, int indx, int count, String newString){
        if(indx==str.length()){
            System.out.println(newString += "x".repeat(count));
            return;
        }
        char currentChar = str.charAt(indx);
        if(currentChar == 'x'){
            count++;
        }else{
            newString += str.charAt(indx);
        }
        addx(str,indx+1,count,newString);
    }
}
