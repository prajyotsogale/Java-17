package dev.lpa;

interface FlightEnabled {
    //any method declared in this is implicitly declared public abstract

    double KM_TO_MILES = 1.60934;
    double MILES_TO_KM = 0.621371;

    public abstract void takeoff();
    abstract void land();
    void fly();

}
interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
