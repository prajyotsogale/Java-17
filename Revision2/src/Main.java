//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dinosaur", "Huge",400);
        doAnimalStuff(animal, "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog streetDog = new Dog("Street Dog",15);
        doAnimalStuff(streetDog,"fast");

        Dog huskie = new Dog("husky",36,"smallcc", "curled");
        doAnimalStuff(huskie,"slow");

        Dog wolf = new Dog("Wolf",50);
        doAnimalStuff(wolf,"slow");

        Fish nimo = new Fish("goldfish",0.25,2,3);
        doAnimalStuff(nimo, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----------");
    }

}