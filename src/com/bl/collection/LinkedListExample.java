package com.bl.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        languages.addFirst("C");
        System.out.println(languages);

        languages.add(4, "C++");
        System.out.println(languages.contains("Java"));

        String str = languages.remove(1);
        System.out.println("Removed Element: " + str);

        System.out.println("Updated LinkedList: " + languages);
        Collections.sort(languages);
        System.out.println(languages);


        ListIterator itr = languages.listIterator(languages.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }

}
