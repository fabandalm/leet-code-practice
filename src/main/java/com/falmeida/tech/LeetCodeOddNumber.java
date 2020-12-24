package com.falmeida.tech;

public class LeetCodeOddNumber {

    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean oddNumber = false;

        int curIndex = 0;
        int pairIndex = curIndex + 1;

        while(!oddNumber){
            if(A[curIndex] == -1){
                curIndex += 1;
            }
            if(pairIndex == A.length -1){
                if(!(A[curIndex] == A[pairIndex])){
                    oddNumber = true;
                }else{
                    A[curIndex] = -1;
                    A[pairIndex] = -1;
                    curIndex += 1;
                    pairIndex = curIndex + 1;
                }
            }else{
                if(A[curIndex] == A[pairIndex]){
                    A[curIndex] = -1;
                    A[pairIndex] = -1;
                    curIndex += 1;
                    pairIndex = curIndex + 1;
                }else{
                    pairIndex += 1;
                }
            }
        }

        return A[curIndex];
    }

}
