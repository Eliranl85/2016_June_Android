package com.company;

/**
 * Created by eladlavi on 31/07/2016.
 */
public class RationalNumber extends Number {

    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator){
        setNumerator(numerator);
        this.denominator = 1;
        setDenominator(denominator);
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0)
            this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return (double)numerator/(double)denominator;
    }
}
