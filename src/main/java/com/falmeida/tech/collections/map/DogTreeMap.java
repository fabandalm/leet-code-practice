package com.falmeida.tech.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class DogTreeMap {

    public static void main(String[] args) {

        Dog d1 = new Dog("red", 20);
        Dog d2 = new Dog("black", 10);
        Dog d3 = new Dog("white", 30);
        Dog d4 = new Dog("white", 10);

        Map<Dog, Integer> dogTreeMap = new TreeMap();
        dogTreeMap.put(d1, 10);
        dogTreeMap.put(d2, 15);
        dogTreeMap.put(d3, 5);
        //dogTreeMap.put(d4, 20);

        for(Map.Entry entry: dogTreeMap.entrySet()){
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

    }

}
