package dev.lpa;

public class Bird extends Animal implements Trackable, FlightEnabled{

    @Override
    public void move() {
        System.out.println("flaps wings");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName()+" is taking off!");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing!");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" high in the sky, mummy bulaye hath na aye...");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates are recorded");
    }
}
