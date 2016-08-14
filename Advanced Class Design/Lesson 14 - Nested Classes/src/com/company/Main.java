package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        four types of nested classes:
        - static nested class
        - inner class
        - local inner class
        - anonymous class
         */


        MyClass.MyStaticNestedClass myStaticNestedClass = new MyClass.MyStaticNestedClass();

        MyClass myClass = new MyClass();
        myClass.x = 8;
        MyClass.MyInnerClass myInnerClass = myClass.new MyInnerClass();
        MyClass.MyInnerClass myInnerClass2 = myClass.new MyInnerClass();
        myInnerClass.foo();

        Object o = myClass.foo();
        System.out.println(o.toString());

        Animal a = myClass.koo();
        a.makeSound();


        //MyClass.MyInnerClass myInnerClass2 = new MyClass().new MyInnerClass();


        Animal anim = new Animal(){
            @Override
            public void makeSound() {
                System.out.println("anonymous");
            }
        };

        anim.makeSound();


        MyAbstractClass myAbstractClass = new MyAbstractClass() {
            @Override
            public void myAbstractMethod() {

            }
        };

    }


}
