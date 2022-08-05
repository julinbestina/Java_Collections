package com.bl.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetExample {

    public static void main(String[] args)  {

        Set<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyan");
        colors.add("Magenta");

        System.out.println(colors);

        System.out.println(colors.isEmpty());
        Iterator itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
