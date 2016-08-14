package com.company;

/**
 * Created by eladlavi on 14/08/2016.
 */
public class MyClass {

    public int x;

    public static class MyStaticNestedClass{
        public void foo(){
            //System.out.println(x);//DOESN'T WORK!
        }
    }

    public class MyInnerClass{
        public void foo(){
            System.out.println(MyClass.this.x);
        }
    }

    public Object foo(){
        class LocalInnerClass{
            public int x;
            public void goo(){

            }

            @Override
            public String toString() {
                return "hey, here it is. " + x;
            }
        }
        int x = 8;
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.goo();
        localInnerClass.x = 19;
        return localInnerClass;
    }

    public Animal koo(){
        class Dog extends Animal{
            @Override
            public void makeSound() {
                System.out.println("dog is making sound");
            }
            public void bark(){

            }
        }
        Dog d = new Dog();
        return d;
    }

    public Animal joo(){
        return new Animal(){
            @Override
            public void makeSound() {
                System.out.println("anonymous");
            }
        };
    }

}
