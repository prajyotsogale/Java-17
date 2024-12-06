import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("wolf","big",50);
        dog.makeNoise();

        doAnimalStuff(dog);
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(new Dog("german shepard","big",40));
        animals.add(new Fish("GoldFish","small",1));
        animals.add(new Fish("tuna","small",10));
        animals.add(new Dog("Street dog","medium",20));

        animals.add(new Horse("Cladsdale","lage",1000));

        for(Animal animal: animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentAnimal){
                currentAnimal.shedHair();
            }
        }

    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}