package com.learning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.1;
        System.out.println(myDoubleArray[0]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of the array is " + arrayLength);
//        System.out.println("last = "+firstTen[arrayLength]);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = {5,4,3,2,1};
//        newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf(newArray[i] + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Using for each loop");
        for (int element : newArray) {
            System.out.print(element + "  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;

        if(objectVariable instanceof int[]){
            System.out.println("objects is really an int array!");
        }
        
        Object[] objects = new Object[3];
        objects[0] = "this";
        objects[1] = "is";
        objects[2] = "object";
        System.out.println(Arrays.toString(objects));

    }
}
