package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(quotient(0, 6));
    }

    public static int distance(int x, int y){
        int result = 0;
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        while (small + result < large)
            result++;

        return result;
    }



    public static int product(int x, int y){
        int result = 0;
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        for (int i = 0; i < small ; i++) {
            result += large;
        }
        return result;
    }

    public static int quotient(int x, int y){
        if(y==0) {
            return -1;
        }
        int count = 0;
        int sum = y;
        while(sum<=x){
            count++;
            sum += y;
        }
        return count;
    }

    public static int remainder(int x, int y){
        if(y == 0)
            return -1;
        return distance(x, product(quotient(x, y), y));

        //return distance(7, product(quotient(7, 3), 3));
        //return distance(7, product(2, 3));
        //return distance(7, 6);
        //return 1;
    }



}
