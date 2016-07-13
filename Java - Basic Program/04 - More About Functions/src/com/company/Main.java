package com.company;

public class Main {

    public static void main(String[] args) {

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
}
