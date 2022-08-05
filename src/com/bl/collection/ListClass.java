package com.bl.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        List<Integer> nextFivePrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Apple");
        fruits.add(null);

        System.out.println(fruits);
        System.out.println(fruits.indexOf("Apple"));
        System.out.println(fruits.get(0));

        fruits.add(5, "Banana");

        System.out.println(fruits.isEmpty());
        System.out.println(fruits);

        fruits.set(4, "Grapes");
        fruits.remove("Banana");

        System.out.println(fruits.remove(2));
//        fruits.removeAll(fruits);
//        fruits.clear();
        System.out.println(fruits.size());

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        fruits.stream().forEach(fruit -> System.out.println(fruit));
        fruits.forEach(fruit -> System.out.println(fruit));

        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        System.out.println(firstFivePrimeNumbers);

        List<Integer> primeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        System.out.println(primeNumbers);

        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        primeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(primeNumbers);
    }
}
