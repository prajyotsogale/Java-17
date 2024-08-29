package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milk","eggs"};
        List<String> list = List.of(items);
        System.out.println(list);

//        System.out.println(list.getClass().getSimpleName());
//        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> anotherList = new ArrayList<>(List.of("spices","tea powder","salt"));
        System.out.println(anotherList);

        groceries.addAll(anotherList);
        System.out.println(groceries);
        groceries.add("milk");
        //.get method
        System.out.println("third item : "+groceries.get(3));

        //.contains method
        if(groceries.contains("eggs")){
            System.out.println("the list contains eggs");
        }

        //finding elements
        System.out.println("first = "+groceries.indexOf("milk"));
        System.out.println("last = "+groceries.lastIndexOf("milk"));

        //remove elements
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("milk","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("salt","apples"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = "+groceries.isEmpty());

        groceries.addAll(List.of("apple","banana","coconut","watermelon"));
        groceries.addAll(Arrays.asList("pomegranate","milk","eggs"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
        System.out.println(groceries.getClass().getName());

    }
}
