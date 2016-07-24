package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {-1, 4, -1, 3, -3};
        System.out.println(maxSubArray(nums));
    }

    public static void reverseOrder(int[] nums){
        int temp, adjacent;
        int upTo = nums.length / 2;
        for (int i = 0; i < upTo; i++) {
            temp = nums[i];
            adjacent = nums.length - i - 1;
            nums[i] = nums[adjacent];
            nums[adjacent] = temp;
        }
    }

    public static int maxSubArray(int[] nums){
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];
            if(maxEndingHere < 0)
                maxEndingHere = 0;
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }



}
