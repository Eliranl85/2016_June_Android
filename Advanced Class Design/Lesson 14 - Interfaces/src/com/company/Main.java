package com.company;

public class Main {

    public static void main(String[] args) {
	    Rollable rollable = new Dog();
        rollable.roll(13);

        Rollable rollable2 = new Rollable(){

            @Override
            public void roll(float degree) {

            }
        };

    }
}
interface Jumpable{
    void jump();
}

interface Edible{
    void eat();
}

interface Speakable{
    void speak();
    void talk();
}

interface Countable{
    int count();
}

interface Rollable{
    void roll(float degree);
}

class Animal{

}

class Dog extends Animal implements Rollable, Countable, Speakable{


    public void bark(){

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void roll(float degree) {

    }

    @Override
    public void speak() {

    }

    @Override
    public void talk() {

    }
}












