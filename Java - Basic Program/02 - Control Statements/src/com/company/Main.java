package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 8;
        int y = 19;
        /*
        System.out.println("start");
        if(x < 5) {
            System.out.println("x is less than five");
        }else if(x < 10){
            System.out.println("x is between 5 and 10");
        }else if(x < 20){
            System.out.println("x is between 10 and 20");
        }else{
            System.out.println("x is greater than or equal to 20");
        }
        System.out.println("end");
        */

        /*
        int y = x++;
        System.out.println(y); //y is 8! if the line before was:
        //int y = ++x then y was 9
        */



        while(x < 20){
            System.out.println("x is less than 20");
            x++;
        }
        System.out.println(x);


        //System.out.println("1" + (1 + 1));


        /*int i = 0;
        while(i<10){
            System.out.println("i is " + i);
            i++;
        }*/



        for (int i = 0; i < x; i++) {
            System.out.println("i is " + i);
        }

        int a = x;
        int b = y;
        if(x > y){
            a = y;
            b = x;
        }
        int z = myFunc(y);
        System.out.println(z);


        System.out.println(distance(5, 8));
    }

    public static int myFunc(int x){
        System.out.println("in myFunc " + x);
        return x + 80;
    }

    public static int distance(int x, int y){
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        int result = 0;
        while(small + result < large)
            result++;
        return result;
    }

    public static int product(int x, int y){
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        int result = 0;
        for (int i = 0; i < small; i++) {
            result += large;
        }
        return result;
    }
}
