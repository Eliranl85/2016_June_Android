package graphicshape;

/**
 * Created by eladlavi on 27/07/2016.
 */
abstract public class Shape {
    protected Color color;

    public static class Color{
        int red, green, blue, alpha;
    }

    public abstract double area();
}
