package com.falmeida.tech;

public class LeetCodeSampleArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,0,1,1,1};

        LeetCodeSampleArray leetCodeSampleArray = new LeetCodeSampleArray();

        if(leetCodeSampleArray.findMaxConsecutiveOnes(nums)==3){
            System.out.println("It is correct");
        }

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxNum = 0;

        int numOfCons = 0;

        for(int i=0;nums.length>i;i++){
            if(nums[i]==1){
                maxNum++;
            }else{
                if(maxNum > numOfCons){
                    numOfCons = maxNum;
                }
                maxNum = 0;
            }
        }

        if(maxNum > numOfCons){
            numOfCons = maxNum;
        }

        return numOfCons;

    }

}
