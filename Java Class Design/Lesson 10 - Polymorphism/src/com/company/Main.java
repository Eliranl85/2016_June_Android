package com.company;


public class Main {

    public static void main(String[] args) {





        /*
        //Animal[] animals = new Animal[4];
        Animal[] animals = {new Dog(), new Animal(), new Cat(), new Poodle()};
        animals[0] = new Dog();
        animals[1] = new Animal();
        animals[2] = new Cat();
        animals[3] = new Poodle();
        ((Poodle)animals[3]).name = "poo";

        Poodle poo = new Poodle();
        washAnimal(poo);

        for (Animal animal : animals) {
            animal.goToSleep();
        }
        */



        Number[] nums = {
                new Integer(4),
                new Double(3.4),
                new Long(34L),
                new Float(234.3f),
                3,
                new RationalNumber(12, 6)
        };

        System.out.println(sum(nums));

    }

    /*
    public static void washAnimal(Animal a){

    }
    */

    public static double sum(Number[] nums){
        double sum = 0.0;
        for (Number num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }


}

