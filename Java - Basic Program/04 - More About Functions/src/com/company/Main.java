package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("(" + j + "," + i + ")");
            }
            System.out.println();
        }
        */


        int a = 5;
        double b = a;


        int[] x = {8};
        func(x);
        System.out.println(x[0]);
    }


    public static void func(int[] x){
        x[0]++;
    }






    public static void drawRectangle(int x, int y, int width, int height){
        for (int i = 0; i < y; i++) {
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                boolean isFrame = i==0 || i==height-1 || j==0 || j==width-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }
    }



    public static void drawRectangle2(int width, int height){
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < height-2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }




    public static void drawX(int size){
        if(size%2 == 0)
            size++;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean isDiagonal = i == j || i + j == size - 1;
                System.out.print(isDiagonal ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void drawCircle(int a, int b, int radius) {
        for (int i = 0; i < b + radius + 10; i++) {
            for (int j = 0; j < a + radius + 10; j++) {
                System.out.print(isPointOnCircle(a, b, radius, j, i) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static boolean isPointOnCircle(int a, int b, int radius, int x, int y){
        int deltaX = a - x;
        int deltaY = b - y;
        int difference = (deltaX*deltaX + deltaY*deltaY) - radius * radius;
        if(difference < 0)
            difference *= -1;
        return difference < 5;
    }


    public static int sumOfDigits(int num){
        int result = 0;
        int lastDigit;
        while(num != 0) {
            lastDigit = num % 10;
            num /= 10;
            result += lastDigit;
        }

        return result;
    }

    public static int largestDigit(int num){
        int result = 0;
        int lastDigit;
        while(num != 0) {
            lastDigit = num % 10;
            num /= 10;

            if(lastDigit > result)
                result = lastDigit;
        }

        return result;
    }

    public static int reverseDigits(int num){
        int result = 0;
        int lastDigit;
        while(num != 0) {
            lastDigit = num % 10;
            num /= 10;

            result = result * 10 + lastDigit;
        }

        return result;
    }

    public static int sqrt(int x){
        int result = 0;
        while(result * result < x)
            result++;
        return result;
    }


    public static double abs(double x){
        return x < 0 ? -x : x;
    }

    public static double sqrtPrecise(double x){
        double result = 0;
        double add = 1000;
        int count = 0;
        while(abs(x - result * result) > 0.00001){
            while((result + add) * (result + add) >= x){
                add /= 10;
            }
            result += add;
        }

        return result;
    }






}
