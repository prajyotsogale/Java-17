package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

        ArrayList<FlightEnabled> flies1 = new ArrayList<>();
        flies1.add(bird);
        LinkedList<FlightEnabled> flies = new LinkedList<>();
        flies.add(bird);

        List<FlightEnabled> betterList = new ArrayList<>();
        betterList.add(bird);

        triggerFlies(flies);
        flyFlies(flies);
        landFlies(flies);

        triggerFlies(betterList);
        flyFlies(betterList);
        landFlies(betterList);

    }

    private static void inFlight( FlightEnabled flier){
        flier.takeoff();
        flier.fly();
        if( flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFlies(List<FlightEnabled> fliers){

        for( var flies : fliers){
            flies.takeoff();
        }
    }
    private static void flyFlies(List<FlightEnabled> fliers){

        for( var flies : fliers){
            flies.fly();
        }
    }
    private static void landFlies(List<FlightEnabled> fliers){

        for( var flies : fliers){
            flies.land();
        }
    }
}
