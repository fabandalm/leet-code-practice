package com.falmeida.tech.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {

        Map<Integer,String> list = new HashMap<>();
        list.put(1,"Fabio");
        list.put(2,"John");
        list.put(3,"Carlos");
        list.put(4,"Joanne");

        Map<Integer,String> list1 = new HashMap<>();

        for(Map.Entry<Integer,String> entry: list.entrySet()){
            if(list1.containsKey(entry.getKey())){
                list1.put(entry.getKey(), list.get(entry.getValue()));
            }else{
                list1.put(entry.getKey(),entry.getValue());
            }
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        for(Map.Entry<Integer,String> item: list1.entrySet()){
            System.out.println(item.getKey() + ", " + item.getValue());
        }

    }

}
