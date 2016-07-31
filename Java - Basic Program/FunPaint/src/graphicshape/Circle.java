package graphicshape;

/**
 * Created by eladlavi on 27/07/2016.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int r){
        this.radius = r;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    void fillColor(){
        System.out.println("color: " + color);
    }
}
