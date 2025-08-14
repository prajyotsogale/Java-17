public class StringReverse {
    static int first = -1;
    static int last = -1;
    public static void main(String[] args) {
//        System.out.println(stringReverse("string",6));
            checkElement("abaacdaefaah",0,'a');
    }
    public static String stringReverse(String string, int length){
        if(length==0){
            return "";
        }
        return string.charAt(length-1)+stringReverse(string,length-1);
    }

    public static void checkElement(String string, int indx, char element){

        if(string.length() == indx){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = string.charAt(indx);
        if(currentChar == element){
            if(first == -1){
                first = indx;
                last = indx;
            }else{
                last = indx;
            }
        }
        checkElement(string,indx +1,element);
    }
}
