public class BitwiseOperators {
    public static void main(String[] args) {
        clearBit(0b0101,2);
    }

    public static void getBit(int num, int pos){
        //get the third bit position 2 of a number

        //bit mask
        int bitmask = 1<<pos;

        if((bitmask & num) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

    }

    public static void setBit(int num, int pos){
        int bitmask = 1<<pos;
        System.out.println(num|bitmask);
    }

    public static void clearBit(int num, int pos){
        int bitmask = ~(1<<pos);
        System.out.println(num & bitmask);
    }

    public static void updateBit(int num, int pos, int to){
        int bitmask = 1<<pos;
        if(to == 1){
            System.out.println(bitmask | num);
        }
        bitmask = ~(bitmask);

        System.out.println(bitmask & num);

    }
}
