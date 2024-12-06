package dev.lpa;

public class Jet implements FlightEnabled, Trackable{

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

    @Override
    public FlightStages transition(FlightStages stages) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnabled.super.transition(stages);
    }
}
