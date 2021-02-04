package com.falmeida.tech.greedy;

public class MinAbsDifferenceSample {

    public static void main(String[] args) {

        int [] n = {-2,2,4};
        System.out.println(getMinAbsArray(n));

    }

    public static int getMinAbsArray(int[] n){

        int i = 1;
        int j = 0;
        int minAbs = Integer.MAX_VALUE;

        while(j < n.length - 1){
            if(i < n.length){
                minAbs = Math.min(minAbs,n[j] - n[i] > 0 ? n[j] - n[i] : -(n[j] - n[i]));
                i++;
            }else{
                j += 1;
                i = j + 1;
            }
        }

        return minAbs;

    }

}
