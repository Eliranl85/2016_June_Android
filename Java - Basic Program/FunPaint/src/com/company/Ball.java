package com.company;

import graphicshape.Circle;

/**
 * Created by eladlavi on 27/07/2016.
 */
public class Ball extends Circle {

    public Ball(int r) {
        super(r);
    }

    void bounce(){
        System.out.println(color);
    }
}
