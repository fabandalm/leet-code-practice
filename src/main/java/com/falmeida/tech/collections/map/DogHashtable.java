package com.falmeida.tech.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DogHashtable {

    public static void main(String[] args) {

        Map<Dog,Integer> dogHashMap = new Hashtable();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");

        dogHashMap.put(d1,10);
        dogHashMap.put(d2,15);
        dogHashMap.put(d3,5);
        dogHashMap.put(d4,20);

        System.out.println(dogHashMap.size());

        for(Map.Entry entry: dogHashMap.entrySet()){
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

    }

}
