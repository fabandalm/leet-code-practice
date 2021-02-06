package com.falmeida.tech.collections.map;

import java.util.Objects;

public class Dog implements Comparable<Dog>{

    private String color;
    private int size;

    public Dog(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" + "color='" + color + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public int compareTo(Dog dog) {
        return this.size - dog.size;
    }

}

