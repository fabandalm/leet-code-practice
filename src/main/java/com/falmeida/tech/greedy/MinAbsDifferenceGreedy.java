package com.falmeida.tech.greedy;

import java.util.Arrays;

public class MinAbsDifferenceGreedy {

    public static void main(String[] args) {

        int [] arr = {-2,2,4};
        System.out.println(getMinAbsArray(arr));

    }

    public static int getMinAbsArray(int[] arr){

        int minAbs = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for(int i = 0; i< arr.length - 1;i++){
            minAbs = Math.min(Math.abs(arr[i +1] -arr[i]),minAbs);
        }

        return minAbs;

    }

}
