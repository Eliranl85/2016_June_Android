package com.company;

/**
 * Created by eladlavi on 03/08/2016.
 */
public class Point {
    private int x, y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x < 0)
            return;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if()
        this.y = y;
    }
}
