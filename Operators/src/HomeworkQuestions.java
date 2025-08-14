public class HomeworkQuestions {

    public static void main(String[] args) {
        toggleBit(5,2,0);
    }

    public static void isPower(int num){
        if((num& (num-1)) == 0){
            System.out.printf("%d is the power of 2",num);
            return;
        }
        System.out.printf("%d is not a power of 2",num);
//        int pow = 2;
//        while(pow <=num){
//            if(pow == num){
//                System.out.printf("%d is the power of 2",num);
//                return;
//            }
//            pow *= 2;
//        }
//        System.out.printf("%d is not a power of 2",num);

    }

    public static void toggleBit(int num, int n, int to){
        if(to==1){
            System.out.println((1<<n) | num );
            return;
        }
        System.out.println((~(1<< n)) & num);
    }

    public static void ones(int num){
        
    }
}

