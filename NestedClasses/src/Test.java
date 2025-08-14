public class Test {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        a = a^b;
//        System.out.println(a);
//        b = a^b;
//        System.out.println(b);
//        a = a^b;
//
//        System.out.println(a);


        int[] arr = {2, 3, 5, 3,1, 2,1};
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println("Unique element: " + result);



    }
}
