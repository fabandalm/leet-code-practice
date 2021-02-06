package com.falmeida.tech.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CatHashMap {

    public static void main(String[] args) {

        Map<Dog,Integer> dogLinkedHashMap = new HashMap<>();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");

        dogLinkedHashMap.put(d1,10);
        dogLinkedHashMap.put(d2,15);
        dogLinkedHashMap.put(d3,5);
        dogLinkedHashMap.put(d4,20);

        System.out.println(dogLinkedHashMap.size());

        for(Map.Entry entry: dogLinkedHashMap.entrySet()){
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

    }

}
