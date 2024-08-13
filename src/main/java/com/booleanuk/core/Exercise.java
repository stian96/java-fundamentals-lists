package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

import java.util.ArrayList;

public class Exercise extends ExerciseBase {
    /*
        A List is like an array but provides a much easier interface to the items it stores, for example:
        - A list doesn't need to have a predefined size, we can add and remove as many things as memory allows
        - We can more easily run looping operations on lists
        - A list is an interface that has multiple implementations depending on the data structure we want,
        e.g. ArrayList, LinkedList, Stack
        - This exercise will focus on using the ArrayList
     */

    /*
        Take some time to read and understand the method below.
        - It creates an instance of an ArrayList that will contain Integer types
            We define the data type that will be stored in a list using angled brackets:
            ArrayList<Datatype>
            We can store any data type in a list, even our own custom classes.
            ArrayList<String>
            ArrayList<Boolean>
            ArrayList<Exercise>

        - It adds a few numbers to the list
        - It outputs the list that now contains a few numbers

        Documentation: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/ArrayList.html
     */
    public ArrayList<Integer> getFavouriteNumbers() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(42);
        list.add(360);
        list.add(120);

        return list;
    }

    public int getSecondNumber() {
        ArrayList<Integer> list = getFavouriteNumbers();
        return list.get(1);
    }

    public ArrayList<Integer> multiply(ArrayList<Integer> list, int number) {
        list.replaceAll(integer -> integer * number);
        return list;
    }


    public boolean isEmpty(ArrayList<String> list) {
        return list.isEmpty();
    }

    public ArrayList<String> addIngredient(ArrayList<String> list, String item) {
        list.add(item);
        return list;
    }

    public ArrayList<String> removeIngredient(ArrayList<String> list, String item) {
        list.remove(item);
        return list;
    }

    public boolean containsIngredient(ArrayList<String> list, String item) {
        return list.contains(item);
    }
}
