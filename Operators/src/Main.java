public class Main {
    public static void main(String[] args) {
        //pre
        int a = 7;
        int b = 3;

        b = ++a;
        System.out.println(a);
        System.out.println(b);

        //post
        a = 7;
        b = 3;
        b = a++;
        System.out.println(a);
        System.out.println(b);

        //pre
        a = 7;
        b = 3;

        b = --a;
        System.out.println(a);
        System.out.println(b);

        //post
        a = 7;
        b = 3;
        b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}