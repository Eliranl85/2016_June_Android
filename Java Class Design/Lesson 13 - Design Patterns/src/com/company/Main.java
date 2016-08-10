package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog d1 = Dog.getDog();
        Dog d2 = Dog.getDog();
        if(d1 == d2){
            System.out.println("you see?");
        }

    }
}

//Singleton
class Dog{

    private static Dog d;


    private Dog(){

    }

    public static Dog getDog(){
        if(d == null)
            d = new Dog();
        return d;
    }

}