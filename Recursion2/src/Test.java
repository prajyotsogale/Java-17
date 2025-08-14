import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        printSubsequences("aaa",0,"",set);
//        printSubseq("abc",0,"");
    }


    public static void printSubsequences(String string, int index, String newString, HashSet<String> allSubseq){
        if(index == string.length()){
            if(allSubseq.contains(newString)){
                return;
            }
            allSubseq.add(newString);
            System.out.println(newString);
            return;
        }

        char currentChar = string.charAt(index);
        //to be
        printSubsequences(string,index+1,newString+currentChar,allSubseq);

        //or not to be
        printSubsequences(string,index+1,newString,allSubseq);
    }


}
