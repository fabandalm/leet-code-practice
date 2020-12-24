package com.falmeida.tech;

public class DecreaseRecursion {

    public static void main(String[] args) {
        decrease(5);
    }

    public static void decrease (int n){
        if(n==0){
            return;
        }
        decrease(n-1);
        System.out.println(n);
    }

}
