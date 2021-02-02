package com.falmeida.tech.array;

public class ReversedArraySample {

    public static void main(String[] args) {

    }

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        int [] reverseArray = new int[a.length];

        int j = 0;

        for(int i = a.length - 1; i >= 0; i--){
            reverseArray[j] = a[i];
            j++;
        }

        return reverseArray;

    }

}
