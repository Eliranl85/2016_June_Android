package com.company;

public class Main {

    public static void main(String[] args) {
//	    int[] nums = {23, 65, 12, 324, -50};
//        System.out.println(max(nums));

        int[] x = new int[]{8};
        x = new int[]{9};
        int[] y = x;
        x[0]++;
        System.out.println(y[0]);

        String s1 = "hello";
        String s2 = s1;
        s1 += " world";
        Integer i = 3;
        Double d = 123.3;

        System.out.println(s2);



        int a = 3;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;

    }

    public static int max(int[] nums){
        //we're in big trouble if nums length is zero
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static double average(int[] nums){
        double sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            sum += num;
//        }
        for (int num : nums) {

        }
        return sum / nums.length;
    }


    //{a, b, c, d, e, f}    {c, d, e}
    public static boolean subArray(int[] arr1, int[] arr2){
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr2.length == 0)
            return true;
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            if(arr2[0] == arr1[i]){
                boolean match = true;
                for (int j = 1; j < arr2.length; j++) {
                    if(arr1[i+j] != arr2[j]){
                        match = false;
                        break;
                    }
                }
                if(match)
                    return true;
            }
        }
        return false;
    }


}
