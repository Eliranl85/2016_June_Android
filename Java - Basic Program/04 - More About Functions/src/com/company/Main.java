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
        drawX(10);

    }


    public static void drawRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean isFrame = i==0 || i==height-1 || j==0 || j==width-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }
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
}
