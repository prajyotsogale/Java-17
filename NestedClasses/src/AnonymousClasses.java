

//anonymous class implementing interface
interface Greetings{
    void hello();
}


public class AnonymousClasses {
    public static void main(String[] args) {
        Greetings greetings = new Greetings(){
            @Override
            public void hello(){
                System.out.println("Greetings my boy!! this is hello from anonymous class");
            }
        };
        greetings.hello();

        Animal dog = new Animal(){
            @Override
            void makeNoise(){
                System.out.println("Bark");
            };
            @Override
            void move(){
                System.out.println("Moving");
            };
            @Override
            void eat(){
                System.out.println("eating");
            };
        };

        dog.makeNoise();
        dog.eat();
        dog.move();
    }
}


//this is to demonstrate extending the anonymous class
class Animal{
    void makeNoise(){
        System.out.println("make some noise for ...");
    };
    void move(){
        System.out.println("I am moved");
    };
    void eat(){
        System.out.println("eating something");
    };
}