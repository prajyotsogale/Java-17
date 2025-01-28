
class Outer{
    String message = "hello from outer class";

    class inner{
        void display(){
            System.out.println(message +" inside inner class");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.message);
        Outer.inner inn = outer.new inner();
        inn.display();

    }
}