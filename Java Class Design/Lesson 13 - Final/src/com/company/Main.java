package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Car.MAX_SPEED);
    }
}

class Car{

    private static int x;
    private static int y;

    static {
        x = 5;
        y = 6;
    }



    private static int counter = 0;

    private final int year;

    public static final int MAX_SPEED = 200;

    public Car(int year){
        this.year = year;
        counter++;
    }

    public void setYear(int year){
        //this.year = year;
    }

}


final class Dog{
    String name;
}
/*
class Poodle extends Dog{

}
*/