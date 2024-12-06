package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

//        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeoff();
//        flier.fly();
//        flier.land();
//
//        tracked.track();

        inFlight(bird);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmTraveled = 100;
        double milesTraveled = kmTraveled*(FlightEnabled.KM_TO_MILES);
        System.out.printf("The truck has traveled %.2f km or %.2f miles %n",kmTraveled,milesTraveled);

    }

    private static void inFlight( FlightEnabled flier){
        flier.takeoff();
        flier.fly();
        if( flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

}
