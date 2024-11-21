package dev.course;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.TUES;
        System.out.println(day);

        for (int i = 0; i <10 ; i++) {
            day = getRandomDay();
//            System.out.printf("Name is %s, Ordinal value = %d%n",day.name(),day.ordinal());
//
//            if(DaysOfTheWeek.FRI == day){
//                System.out.println("FOUND");}
            switchDaysOfTheWeek(day);
        }
    }

    public static void switchDaysOfTheWeek(DaysOfTheWeek days){
        int weekDayInteger = days.ordinal() + 1;

        switch (days){
            case WED -> System.out.println("Wednesday is day "+weekDayInteger);
            case MON -> System.out.println("Monday is day "+weekDayInteger);
            default -> System.out.println(days.name().charAt(0) +
                    days.name().substring(1).toLowerCase() +
                    "day is Day"+weekDayInteger);
        }

    }

    public static DaysOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var anyDay = DaysOfTheWeek.values();

        return anyDay[randomInteger];
    }

}
