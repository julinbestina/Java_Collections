package com.bl.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]){
        LinkedHashSet<String> names=new LinkedHashSet<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        Iterator<String> itr=names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

