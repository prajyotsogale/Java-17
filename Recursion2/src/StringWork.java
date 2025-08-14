public class StringWork {
    static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        removeDuplicate("aabbccdaac",0,"");
    }
    public static void removeDuplicate(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);
        if(map[currentChar - 'a'] == true){
            removeDuplicate(str,index+1,newString);
        }else{
            newString+= currentChar;
            map[currentChar -'a'] =true;
            removeDuplicate(str,index+1,newString);
        }
    }
}
