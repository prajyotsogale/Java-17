
class OuterStatic{
    static String message = "hello from outer class";
    static class inner{
        void display(){
            System.out.println(message + "inside inner static class");
        }
    }
}


public class StaticExample {

    public static void main(String[] args) {
//        OuterStatic outerStatic = new OuterStatic();  do not instantiate only static
        System.out.println(OuterStatic.message);

        ///

        // NO INSTANTIATION FOR STATIC!!!!

        ///

        OuterStatic.inner outerStatic = new OuterStatic.inner();
        outerStatic.display();
    }
}
