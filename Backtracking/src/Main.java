public class Main {
    public static void main(String[] args) {
        permutations("abc","");
    }
    public static void permutations(String string,String newString){

        if(string.isEmpty()){
            System.out.println(newString);
            return;
        }

        for(int i=0;i<string.length();i++){
            char currentCharacter = string.charAt(i);
            String str = string.substring(0,i)+string.substring(i+1);
            permutations(str,newString+currentCharacter);
        }
    }
}