package com.bl.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        System.out.println("Reverse TreeSet: " + evenNumbers.descendingSet());
        System.out.println(evenNumbers.headSet(4, true));
        System.out.println(evenNumbers.headSet(4));
        System.out.println(evenNumbers.tailSet(4));
        System.out.println(evenNumbers.subSet(4, 6));

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
        Iterator itr = numbers.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

