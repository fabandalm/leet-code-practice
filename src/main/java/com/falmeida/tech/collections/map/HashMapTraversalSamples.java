package com.falmeida.tech.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraversalSamples {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        //Entry Set and for Loop
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        //Iterator and Entry Set
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        //Lambdas
        map.forEach((k,v) -> System.out.println(k + ", " + v));

        //Streams
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ", " + e.getValue()));

    }

}
