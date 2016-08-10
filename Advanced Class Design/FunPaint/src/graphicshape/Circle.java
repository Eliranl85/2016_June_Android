package graphicshape;

import com.company.Point;

/**
 * Created by eladlavi on 27/07/2016.
 */
public class Circle extends Shape {

    private int radius;
    private Point center;


    public Circle(Point center, int radius){
        this.center = center;
        setRadius(radius);
    }

    public Circle(int r){
        this(new Point(10, 10), r);
    }

    public Circle(){
        this(7);
    }


    @Override
    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Circle){
            Circle other = (Circle)obj;
            return other.center.equals(this.center) && other.radius == this.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return center.hashCode() ^ radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius >= 0)
            this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    void fillColor(){
        System.out.println("color: " + color);
    }

    public void fillColor(int red, int green, int blue){

    }

    public void fillColor(float hue, float saturation, float brightness){

    }







}
