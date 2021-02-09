package com.falmeida.tech.collections.map;

public class GrandChildSample extends ChildSample{

    public void print(){
        super.print();
        System.out.println("GrandChild");
    }

    public static void main(String[] args) {
        GrandChildSample grandChildSample = new GrandChildSample();
        grandChildSample.print();

        ChildSample childSample = new GrandChildSample();
        childSample.print();


    }

}
