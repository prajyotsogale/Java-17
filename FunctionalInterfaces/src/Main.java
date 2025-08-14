
@FunctionalInterface
interface Greetings{
    void greet();
}


public class Main {
    public static void main(String[] args) {
        Greetings greetings = () -> System.out.println("How you doinn");
        greetings.greet();
    }
}