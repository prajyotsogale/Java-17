package com.learning;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name,"Dairy",1);
    }
}

public class Main {
    public static void main(String[] args) {
//        Object[] groceryArray = new Object[3];
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "Produce",6);
        groceryArray[2] = new GroceryItem("Oranges","produce",5);

        System.out.println(Arrays.toString(groceryArray));

        //Not recommended
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GroceryItem("butter"));
        arrayList.add("biscuit");
        //Not recommended

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("biscuit"));
    }
}
