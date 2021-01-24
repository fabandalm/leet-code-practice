package com.falmeida.tech;

public class SolutionTwitter {

    public static int rob(int[] nums) {
        int oddHouseResult = 0;
        int evenHouseResult = 0;

        for(int i=0; i<nums.length;i++){
            if(i %2 == 0){
                System.out.println("even");
                System.out.println(i);
                evenHouseResult += nums[i];
                System.out.println(evenHouseResult);
            }else{
                System.out.println("odd");
                System.out.println(i);
                oddHouseResult += nums[i];
                System.out.println(oddHouseResult);
            }
        }

        if(oddHouseResult>evenHouseResult){
            return oddHouseResult;
        }else{
            return evenHouseResult;
        }
    }

    public static void main(String[] args){
        int [] nums1 = {2,3,2};
        int [] nums2 = {1,2,3,1};
        int [] nums3 = {1,2,3,1};
        int [] nums4 = {1,2,3,1};
        int [] nums5 = {1,2,3,1};
        int [] nums6 = {1,2,3,1};
        int [] nums7 = {1,2,3,1};
        int [] nums8 = {1,2,3,1};
        System.out.println(SolutionTwitter.rob(nums1));
    }

}
