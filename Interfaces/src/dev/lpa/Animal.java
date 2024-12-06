package dev.lpa;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitering "+this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1)% allStages.length];
    }
}


record DragonFly( String name, String type) implements FlightEnabled{

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;

    public void achieveOrbit(){
        transition("Orbit achieved");
    }

    @Override
    public void takeoff() {
        System.out.println("taking off");
    }

    @Override
    public void land() {
        System.out.println("landing..");
    }

    @Override
    public void fly() {
        achieveOrbit();
        System.out.println("Data Collection while orbiting");
    }

    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today+" : "+description);
    }

    private static void logStage( FlightStages stage, String description){
        description = stage +" : "+ description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stages) {

        FlightStages nextStage = FlightEnabled.super.transition(stages);
        logStage(stages, " beginning transition to " + nextStage);
        return nextStage;

    }
}


interface FlightEnabled {
    //any method declared in this is implicitly declared public abstract

    double KM_TO_MILES = 1.60934;
    double MILES_TO_KM = 0.621371;

    public abstract void takeoff();
    abstract void land();
    void fly();

    default FlightStages transition ( FlightStages stages){
//        System.out.println("transition not implemented on "+getClass().getName());
//        return null;
        FlightStages nextStage = stages.getNextStage();
        System.out.println("Transitioning from "+stages+" to "+nextStage);
        return nextStage;
    }

}
interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
