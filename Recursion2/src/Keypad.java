public class Keypad {

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","uwx","yz"};

    public static void main(String[] args) {
        printParameters("23",0,"");
    }

    public static void printParameters(String str, int index, String combination){

        if(index == str.length()){
            System.out.println(combination);
            return;
        }

        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printParameters(str,index+1, combination+ mapping.charAt(i));
        }
        
    }
}
