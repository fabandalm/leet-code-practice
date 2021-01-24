package com.falmeida.tech.recursion;

public class RecursionSample01 {

    static int x = 0;

    public static void main(String[] args) {
        rec(3);
        System.out.println("x: " + x);
    }

    public static int rec(int n){
        x++;
        System.out.println("n: " + n);
        if(n>0){
            rec(n - 1);
            rec(n - 1);
            rec(n - 1);
        }
        return 0;

    }

}
