package com.falmeida.tech.collections.map;

import java.util.*;

public class HashMapObjectSample {

    public static void main(String[] args) {
        Cat cat1 = new Cat("white");
        Cat cat2 = new Cat("white");

        Map<Cat,Integer> list = new HashMap<>();
        list.put(cat1,1);
        list.put(cat2,2);

        for (Map.Entry<Cat,Integer> entry: list.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

    }

}
