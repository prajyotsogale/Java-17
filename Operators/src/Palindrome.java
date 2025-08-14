public class Palindrome {
    public static void main(String[] args){
        String s = "racecar";
        System.out.println(reverseString(s));
        if(s.equals(reverseString(s))){
            System.out.println("the string is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
     public static String reverseString(String s){
        if(s == ""){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);

    }
}
