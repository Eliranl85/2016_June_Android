package com.company;

/**
 * Created by eladlavi on 03/08/2016.
 */
public class Segment {

    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        //aliasing
        //this.p1 = new Point(p1.getX(), p1.getY());
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        //Point p = new Point(p1.getX(), p1.getY());
        //return p;
        return p1;
    }

//    public void setP1(Point p1) {
//        this.p1 = p1;
//    }

    public Point getP2() {
        return p2;
    }

//    public void setP2(Point p2) {
//        this.p2 = p2;
//    }


    public double slope(){
        double deltaY = p1.getY() - p2.getY();
        double deltaX = p1.getX() - p2.getX();
        if(deltaX == 0)
            return Double.MAX_VALUE;
        return deltaY/deltaX;
    }

    public double B(){
        return 1;
    }

    public double A(){
        return -1*slope();
    }

    public double C(){
        return slope()*p1.getX() - p1.getY();
    }

    public double distanceToPoint(Point point){
        double numerator = A()*point.getX() + B()*point.getY()
                + C();
        if(numerator < 0)
            numerator *= -1;
        double denominator = Math.sqrt(A()*A() + B()*B());
        return numerator / denominator;
    }

    public double length(){
        return p1.distanceTo(p2);
    }
}
