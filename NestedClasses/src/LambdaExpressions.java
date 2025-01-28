//basic
interface Action{
    //only one method should be used!!! for lambda experssion
    void performAction();
}

//lambda expressions with parameters
interface Adder{
    int add(int a, int b);
}


//multiple statements
interface Greeting1{
    void greet(String name);
}
public class LambdaExpressions {
    public static void main(String[] args) {
        Action action = () -> System.out.println("Action performed");
        action.performAction();

        Adder adder = (int a, int b) -> a+b;

        System.out.println(adder.add(4,5));

        //if you need multiple statements enclose it with {}
        Greeting1 greeting1 = (name) -> {
            System.out.println("hello "+name);
            System.out.println("Welcome to java World");
        };
        greeting1.greet("Prajyot");

    }
}
