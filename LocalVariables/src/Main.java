public class Main{
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19,99));
    }
    public static boolean hasSharedDigit(int num1,int num2){

        boolean fvalid = num1>9 && num1<100;
        boolean svalid = num2>9 && num2<100;

        ////we can also take boolean like this



        if(!fvalid||!svalid){
            return false;
        }

        int fnum1 = num1%10;
        int snum1 = num1/10;

        int fnum2 = num2%10;
        int snum2 = num2/10;

        boolean first = fnum1==fnum2||fnum1==snum2;
        boolean second = snum1==fnum2||snum1==snum2;

        return first||second;

    }
}