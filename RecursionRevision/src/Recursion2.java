import java.util.HashSet;

public class Recursion2 {
    public static void main(String[] args) {
//        towerOfHanoi(3,"S","H","D");

//        System.out.println(strReverse("abc"));

//        pfnl("abcabcxabbab",'a',0);

//        int[] arr = {1,2,2,3,4,5};
//        System.out.println(checkSortedArray(arr,0));
//        System.out.println(addX("abc",3));

//        removeDuplicates("abacbacba",0,"");
//        HashSet<String> hash = new HashSet<>();
//        uniqueSubsequences("aaa",0,"",hash);
        printKeypad("23",0,"");
    }


    public static void towerOfHanoi(int n, String src, String helper, String destination){

        if(n==1){
            System.out.println("transfer disk "+ n+ " from "+ src+ " to "+ destination);
            return;
        }

        towerOfHanoi(n-1,src,destination,helper);

        System.out.println("transfer disk "+ n+ " from "+ src+ " to "+ destination);

        towerOfHanoi(n-1, helper,src,destination);
    }

    public static String strReverse(String str){

        if(str.length() == 1){
            return str;
        }

        char currentChar = str.charAt(0);

        String nextString = strReverse(str.substring(1));

        return nextString+ currentChar;

    }
    public static int first = -1;
    public static int last = -1;
    public static void pfnl(String string , char character, int index){

        if(index == string.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }


        char currentChar = string.charAt(index);

        if(currentChar == character){
            if(first == -1){
                first = index;
                last = index;
            }
            else{
                last = index;
            }
        }

        pfnl(string, character,index+1);



    }

    public static boolean checkSortedArray(int[] arr, int index){
        if(index+1 == arr.length){
            return true;
        }
        return (arr[index]>arr[index+1]?false:checkSortedArray(arr,index+1));
//        return (arr[index] <= arr[index + 1] && checkSortedArray(arr, index + 1));

    }

    public static String moveChar(String string,int count, int index){
        if(index == string.length()){
            return addX(count);
        }

        if(string.charAt(index)=='x'){
            return moveChar(string,count++,index++);
        }else{
            String newString = moveChar(string,count,index+1);
            return string.charAt(index) + newString;
        }
    }
    
    public static String addX(int count){
        String string = "";
        for (int i = 1; i <= count; i++) {
            string += 'x';
        }
        return string;
    }
    static boolean[] map = new boolean[26];
    public static void removeDuplicates(String string,int index, String newString){
        if(index == string.length()){
            System.out.println(newString);
            return;
        }
        char currentCharacter = string.charAt(index);
        if(!map[currentCharacter - 'a']){
            newString += currentCharacter;
            map[currentCharacter - 'a'] = true;
        }
        removeDuplicates(string,index+1,newString);
    }

    public static void subsequences(String string, int index, String newString){
        if(index == string.length()){
            System.out.println(newString);
            return;
        }

        //to be
        subsequences(string,index+1,newString + string.charAt(index));
        // or not to be
        subsequences(string,index+1,newString);
    }

    public static void uniqueSubsequences(String string, int index, String newString, HashSet<String> hashSet){
        if(index == string.length()){
            if(hashSet.contains(newString)){
                return;
            }
            hashSet.add(newString);
            System.out.println(newString);
            return;
        }

        //to be
        uniqueSubsequences(string, index+1,newString+string.charAt(index),hashSet);
        // or not to be
        uniqueSubsequences(string, index+1,newString,hashSet);

    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKeypad(String string, int index, String newString){
        if(index == string.length()){
            System.out.println(newString);
            return;
        }
        for (int i = 0; i < keypad[string.charAt(index) - '0'].length(); i++) {

            char currentCharacter = keypad[string.charAt(index) - '0'].charAt(i);
            printKeypad(string, index+1,newString+currentCharacter);
        }
    }

}
