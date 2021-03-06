package com.company;

import graphicshape.Circle;

/**
 * Created by eladlavi on 27/07/2016.
 */
public class Ball extends Circle {

    public Ball(int r) {
        super(r);
    }

    public double volume(){
        return area() * getRadius() / 3;
    }

    @Override
    public double area() {
        return 4 * super.area();
    }

    void bounce(){
        System.out.println(color);
    }
}
