package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Rough {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);

//        System.out.println(list.getClass().getSimpleName());
//        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> anotherList = new ArrayList<>(List.of("spices", "tea powder", "salt"));
        System.out.println(anotherList);

        groceries.addAll(anotherList);
        System.out.println(groceries);

    }
}
